package it.hose.movieTerra.userService.dto;

import lombok.Data;

@Data
public class UserRegisterRequestDto {

    private String name;
    private String email;
    private String phone;
    private String password;

}
