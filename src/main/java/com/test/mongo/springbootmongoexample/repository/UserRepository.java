package com.test.mongo.springbootmongoexample.repository;

import com.test.mongo.springbootmongoexample.document.Users;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by premsingh on 6/17/18.
 */
public interface UserRepository extends MongoRepository<Users,Integer> {
}
