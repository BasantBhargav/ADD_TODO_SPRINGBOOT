package com.example.todo.Controller;

import com.example.todo.DTO.TodoDTO;
import com.example.todo.Models.Todo;
import com.example.todo.Service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todo")
@CrossOrigin("*")
public class TodoController {

    @Autowired
    private TodoService service;

    @PostMapping("/add")
    public Todo add(@RequestBody TodoDTO dto){
        return service.addTodo(dto);
    }

    @GetMapping("/all")
    public List<Todo> getAll(){
        return service.getAll();
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable String id){
        return service.delete(id);
    }
}
