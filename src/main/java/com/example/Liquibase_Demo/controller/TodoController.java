package com.example.Liquibase_Demo.controller;

import com.example.Liquibase_Demo.entity.Todo;
import com.example.Liquibase_Demo.repository.TodoRepository;
import com.example.Liquibase_Demo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todo")
public class TodoController {

    private TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @PostMapping("/create")
    public String createTodo(@RequestBody Todo todo) {
        todoService.createTodos(todo);
        return "Saved Succesfully";
    }

    @GetMapping("/list")
    public List<Todo> listOfTodo() {
        return todoService.list();
    }
}
