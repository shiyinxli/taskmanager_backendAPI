package com.shiyinxli.taskmanager.service;

import com.shiyinxli.taskmanager.dto.TaskRequest;
import com.shiyinxli.taskmanager.dto.TaskResponse;
import com.shiyinxli.taskmanager.entity.Task;
import com.shiyinxli.taskmanager.repository.TaskRepository;

import java.util.List;

public interface TaskService {
    //create
//    Task createTask(Task task);
    TaskResponse createTask(TaskRequest request);
    //read
    List<TaskResponse> getAllTasks();
    TaskResponse getTaskById(Long id);
}
