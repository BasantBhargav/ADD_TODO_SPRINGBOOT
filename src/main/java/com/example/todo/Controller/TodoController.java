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

    // add todo using DTO
    @PostMapping("/add")
    public Todo addTodo(@RequestBody TodoDTO dto){
        return service.addTodo(dto);
    }

    // get all todos
    @GetMapping("/all")
    public List<Todo> getAll(){
        return service.getAllTodos();
    }

    // delete todo
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable String id){
        return service.deleteTodo(id);
    }
}
