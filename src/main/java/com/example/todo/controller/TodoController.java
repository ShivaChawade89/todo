package com.example.todo.controller;

import com.example.todo.model.Todo;
import com.example.todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;



@RestController
public class TodoController {




    @Autowired
    TodoService todoService;




    @PostMapping("/add-todo")
    public Todo addTodo(@RequestBody Todo todo) {
        return todoService.addTodo(todo);
    }


    @GetMapping("/findById/{id}")
    public Todo findTodoById(@PathVariable int id) {
        return todoService.findById(id);
    }


    @GetMapping("find-all")
    public List<Todo> findAllTodos() {
        return todoService.findAll();
    }

    @PutMapping("update-todo/{id}")
    public String updateTodo(@PathVariable int id,@RequestBody Todo todo) {
       return todoService.updateTodo(id,todo);
    }


    @DeleteMapping("deleteById/{id}")
    public String deleteTodo(@PathVariable int id) {
        return todoService.deleteTodo(id);
    }

}