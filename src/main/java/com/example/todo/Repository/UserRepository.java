package com.example.todo.Repository;

import com.example.todo.Models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,String> {

    User findByEmail(String email);
}
