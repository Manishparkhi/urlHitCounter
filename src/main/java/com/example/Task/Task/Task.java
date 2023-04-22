package com.example.Task.Task;

public class Task {
    private int count ;
    private  String name;

    public Task(String str , int count){

        this.name =   str;
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Task{" +
                "count=" + count +
                ", name='" + name + '\'' +
                '}';
    }
}
