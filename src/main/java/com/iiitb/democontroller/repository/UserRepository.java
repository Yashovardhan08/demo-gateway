package com.iiitb.democontroller.repository;

import com.iiitb.democontroller.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;


//@Repository
public interface UserRepository extends MongoRepository<User, String> {
    Optional<User> findByUserName(String username);

    Optional<User> findByCollegeEmail(String email);

    Boolean existsByUserName(String username);

    Boolean existsByCollegeEmail(String email);
}