package com.test.mongo.springbootmongoexample.controller;

import com.test.mongo.springbootmongoexample.document.Users;
import com.test.mongo.springbootmongoexample.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by premsingh on 6/17/18.
 */

@RestController
@RequestMapping("/rest/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/all")
    public List<Users> getUsers(){

        return userRepository.findAll();
    }
}
