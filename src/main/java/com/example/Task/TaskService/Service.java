package com.example.Task.TaskService;

import com.example.Task.Task.Task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@org.springframework.stereotype.Service
public class Service {

   static HashMap<String , Integer> map = new HashMap<>();
//    int counter = 0;


    public Task getCount(String str){


         int  counter =  map.put(str , map.getOrDefault(str , 0)+ 1);

        Task task = new Task(str , counter ++);
        return task;
      }


}
