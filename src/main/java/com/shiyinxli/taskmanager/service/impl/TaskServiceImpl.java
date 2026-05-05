package com.shiyinxli.taskmanager.service.impl;

import com.shiyinxli.taskmanager.entity.Task;
import com.shiyinxli.taskmanager.repository.TaskRepository;
import com.shiyinxli.taskmanager.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskServiceImpl implements TaskService {
    private final TaskRepository taskRepository;

    @Override
    public Task createTask(Task task){
        return taskRepository.save(task);
    }

    @Override
    public List<Task> getAllTasks(){
        return taskRepository.findAll();
    }
}
