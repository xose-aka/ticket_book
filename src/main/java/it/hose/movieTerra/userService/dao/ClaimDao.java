package it.hose.movieTerra.userService.dao;

import it.hose.movieTerra.userService.model.Claim;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClaimDao extends MongoRepository<Claim, String> {
    Claim getClaimByName(String name);
}
