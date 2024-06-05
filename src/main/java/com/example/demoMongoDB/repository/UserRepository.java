package com.example.demoMongoDB.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demoMongoDB.model.User;

public interface UserRepository extends MongoRepository<User, String> {
    
}
