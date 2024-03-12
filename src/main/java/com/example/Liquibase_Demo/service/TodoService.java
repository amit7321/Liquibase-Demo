package com.example.Liquibase_Demo.service;

import com.example.Liquibase_Demo.entity.Todo;
import com.example.Liquibase_Demo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    public void createTodos(Todo todo) {
        todoRepository.save(todo);
    }

    public List<Todo> list() {
        return todoRepository.findAll();
    }
}
