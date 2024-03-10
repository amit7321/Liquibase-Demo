package com.example.Liquibase_Demo.service;

import com.example.Liquibase_Demo.entity.Todo;
import com.example.Liquibase_Demo.repository.TodoRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class TodoService {

    private TodoRepository todoRepository;

    public String createTodos(Long id) {
        todoRepository.save(new Todo("Project List", "Loren ipsum ......"));
        return todoRepository.findById(id) + "Saved Succesfully";
    }

    public List<Todo> list() {
        return todoRepository.findAll();
    }
}
