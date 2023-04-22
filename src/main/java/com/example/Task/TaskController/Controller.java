package com.example.Task.TaskController;

import com.example.Task.Task.Task;
import com.example.Task.TaskService.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class Controller{

    @Autowired
     private Service service;

    @GetMapping("Find-All/count/{username}")
    public Task CountValue(@PathVariable String username){
//      Task task = service.getCount(username);
//      return task;
       return service.getCount(username);

    }
}
