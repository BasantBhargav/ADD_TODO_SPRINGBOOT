package com.example.todo.Service;

import com.example.todo.DTO.UserDTO;
import com.example.todo.Models.User;
import com.example.todo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    // signup
    public String signup(UserDTO dto){

        if(repo.findByEmail(dto.getEmail())!=null){
            return "User already exists";
        }

        User u=new User();
        u.setEmail(dto.getEmail());
        u.setPassword(dto.getPassword());

        repo.save(u);
        return "Signup successful";
    }

    // login
    public String login(UserDTO dto){

        User user=repo.findByEmail(dto.getEmail());

        if(user==null){
            return "User not found";
        }

        if(!user.getPassword().equals(dto.getPassword())){
            return "Wrong password";
        }

        return "Login success";
    }
}
