package com.example.demoMongoDB.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demoMongoDB.model.Movie;

public interface MovieRepository extends MongoRepository<Movie, Integer>{

}
