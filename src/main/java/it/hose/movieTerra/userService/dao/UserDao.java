package it.hose.movieTerra.userService.dao;

import it.hose.movieTerra.userService.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserDao extends MongoRepository<User, String> {

    User findUserById(String id);

}
