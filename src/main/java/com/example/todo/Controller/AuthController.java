package com.example.todo.Controller;

import com.example.todo.DTO.UserDTO;
import com.example.todo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@CrossOrigin("*")
public class AuthController {

    @Autowired
    private UserService service;

    @PostMapping("/signup")
    public String signup(@RequestBody UserDTO dto){
        return service.signup(dto);
    }

    @PostMapping("/login")
    public String login(@RequestBody UserDTO dto){
        return service.login(dto);
    }
}
