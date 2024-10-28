package it.hose.movieTerra.userService.service;

import it.hose.movieTerra.userService.dto.UserRegisterRequestDto;
import it.hose.movieTerra.userService.model.User;

public interface UserService {
    Boolean isExists(String id);

    void add(UserRegisterRequestDto userRegisterRequestDto);

    User getByEmail(String email);

    boolean isCustomer();

    boolean isAdmin();
}
