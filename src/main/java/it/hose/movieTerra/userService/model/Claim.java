package it.hose.movieTerra.userService.model;

import lombok.Builder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Builder
public class Claim {

    @Id
    private String id;
    private String name;
}
