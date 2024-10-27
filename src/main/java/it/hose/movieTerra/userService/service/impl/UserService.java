package it.hose.movieTerra.userService.service.impl;

import it.hose.movieTerra.userService.dto.UserRegisterRequestDto;
import it.hose.movieTerra.userService.model.User;

public interface UserService {
    Boolean isExists(Long id);

    void add(UserRegisterRequestDto userRegisterRequestDto);

    User getByEmail(String email);

    boolean isCustomer();

    boolean isAdmin();
}
