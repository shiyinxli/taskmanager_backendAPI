package com.shiyinxli.taskmanager.service;

import com.shiyinxli.taskmanager.entity.Task;

import java.util.List;

public interface TaskService {
    //create
    Task createTask(Task task);
    //read
    List<Task> getAllTasks();
}
