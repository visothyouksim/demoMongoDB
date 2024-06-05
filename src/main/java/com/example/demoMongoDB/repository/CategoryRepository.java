package com.example.demoMongoDB.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demoMongoDB.model.Category;

public interface CategoryRepository extends MongoRepository<Category, String> {
    
}
