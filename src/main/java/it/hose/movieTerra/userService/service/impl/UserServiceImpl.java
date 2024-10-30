package it.hose.movieTerra.userService.service.impl;

import it.hose.movieTerra.userService.dao.ClaimDao;
import it.hose.movieTerra.userService.dao.UserDao;
import it.hose.movieTerra.userService.dto.UserRegisterRequestDto;
import it.hose.movieTerra.userService.model.Claim;
import it.hose.movieTerra.userService.model.User;
import it.hose.movieTerra.userService.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserDao userDao;
    private final ClaimDao claimDao;

    @Override
    public Boolean isExists(String id) {
        User user = userDao.findUserById(id);
        return user != null;
    }

    @Override
    public void add(UserRegisterRequestDto userRegisterRequestDto) {
        Claim claim = claimDao.getClaimByName("CUSTOMER");

        User user = User.builder()
                .email(userRegisterRequestDto.getEmail())
                .password(userRegisterRequestDto.getPassword())
                .name(userRegisterRequestDto.getName())
                .claim(claim)
                .build();

        userDao.insert(user);
    }

    @Override
    public User getByEmail(String email) {
        return userDao.findUserByEmail(email);
    }

    @Override
    public boolean isCustomer() {

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        return authentication.getAuthorities().stream().anyMatch(
                a -> a.getAuthority().equals("ROLE_CUSTOMER")
        );
    }

    @Override
    public boolean isAdmin() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        return authentication.getAuthorities().stream().anyMatch(
                a -> a.getAuthority().equals("ROLE_ADMIN")
        );
    }
}
