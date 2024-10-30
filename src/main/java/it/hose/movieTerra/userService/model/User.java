package it.hose.movieTerra.userService.model;

import lombok.Builder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Builder
public class User {

    @Id
    private String Id;

    @Indexed(unique = true)
    private String email;

    private String password;

    private String name;

    private Claim claim;
}
