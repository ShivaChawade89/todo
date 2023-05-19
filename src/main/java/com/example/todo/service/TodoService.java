package com.example.todo.service;


import com.example.todo.dao.TodoRepository;
import com.example.todo.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


@Service
public class TodoService {


   @Autowired
    TodoRepository todoRepository;

    public List<Todo> findAll() { // Business Logic
        return todoRepository.findAll();
    }

    public Todo findById(int id) { // business Logic

        return todoRepository.findById(id).get();


    }

    public Todo addTodo(Todo todo) {
        return todoRepository.save(todo);
    }

    public String deleteTodo(int id) {
        todoRepository.deleteById(id);
        return "deleted";
    }

    public String updateTodo(int id,Todo newTodo) {


        Todo todo=todoRepository.findById(id).get();// step 1

        todo.setStatus(newTodo.isStatus());
        todo.setId(newTodo.getId());
        todo.setTitle(newTodo.getTitle());

        todoRepository.save(todo);
        return "updated";
    }
}
