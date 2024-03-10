package com.example.Liquibase_Demo.controller;

import com.example.Liquibase_Demo.entity.Todo;
import com.example.Liquibase_Demo.repository.TodoRepository;
import com.example.Liquibase_Demo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/todo", produces = {MediaType.APPLICATION_JSON_VALUE})
public class TodoController {

    @Autowired
    private TodoRepository todoRepository;
    private TodoService todoService;

//    @PostMapping("/create")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String createTodo(@RequestParam Long id) {
//        todoRepository.save(new Todo("Project List", "Loren ipsum ......"));
        return todoService.createTodos(id);
//        return todoRepository.findById(id) + "Saved Succesfully";
    }

    @GetMapping("/list")
    public List<Todo> listOfTodo() {
        return todoService.list();
    }
}
