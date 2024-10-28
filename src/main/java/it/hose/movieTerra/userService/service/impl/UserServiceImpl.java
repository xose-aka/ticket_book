package it.hose.movieTerra.userService.service.impl;

import it.hose.movieTerra.userService.dao.UserDao;
import it.hose.movieTerra.userService.dto.UserRegisterRequestDto;
import it.hose.movieTerra.userService.model.User;
import it.hose.movieTerra.userService.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    @Override
    public Boolean isExists(String id) {
        User user = userDao.findUserById(id);
        return user != null;
    }

    @Override
    public void add(UserRegisterRequestDto userRegisterRequestDto) {

    }

    @Override
    public User getByEmail(String email) {
        return null;
    }

    @Override
    public boolean isCustomer() {
        return false;
    }

    @Override
    public boolean isAdmin() {
        return false;
    }
}
