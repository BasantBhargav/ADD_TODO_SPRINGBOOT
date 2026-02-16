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
        Todo t=new Todo();
        t.setTitle(dto.getTitle());
        t.setDescription(dto.getDescription());
        return repo.save(t);
    }

    public List<Todo> getAll(){
        return repo.findAll();
    }

    public String delete(String id){
        repo.deleteById(id);
        return "Deleted";
    }
}
