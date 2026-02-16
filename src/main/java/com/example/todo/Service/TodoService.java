package com.example.todo.Service;

import com.example.todo.DTO.TodoDTO;
import com.example.todo.Models.Todo;
import com.example.todo.Repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    @Autowired
    private TodoRepository repo;


    public Todo addTodo(TodoDTO dto){

        Todo todo = new Todo();
        todo.setTitle(dto.getTitle());
        todo.setDescription(dto.getDescription());

        return repo.save(todo);
    }

    public List<Todo> getAllTodos(){
        return repo.findAll();
    }


    public String deleteTodo(String id){
        repo.deleteById(id);
        return "Todo Deleted Successfully";
    }
}
