package com.example.demoMongoDB.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoMongoDB.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;
}
