package com.test.mongo.springbootmongoexample.config;

import com.test.mongo.springbootmongoexample.document.Users;
import com.test.mongo.springbootmongoexample.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Created by premsingh on 6/17/18.
 */

@EnableMongoRepositories(basePackageClasses = com.test.mongo.springbootmongoexample.repository.UserRepository.class)
@Configuration
public class MongoDBConfig {

    @Bean
    CommandLineRunner commandLineRunner(UserRepository userRepository){

        return strings -> {
            userRepository.save(new Users(1, "Peter", "Development", 3000L));
            userRepository.save(new Users(2, "Sam", "Operations", 2000L));
            userRepository.save(new Users(3, "Palak", "Manager", 20000L));
            userRepository.save(new Users(4, "Prem", "Architect", 5000L));
            userRepository.save(new Users(5, "Samaiara", "Tech Manager", 200000L));
        };
    }



}
