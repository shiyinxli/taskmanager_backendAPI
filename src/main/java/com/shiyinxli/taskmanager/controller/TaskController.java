package com.shiyinxli.taskmanager.controller;

import com.shiyinxli.taskmanager.dto.TaskRequest;
import com.shiyinxli.taskmanager.dto.TaskResponse;
import com.shiyinxli.taskmanager.entity.Task;
import com.shiyinxli.taskmanager.service.TaskService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
@RequiredArgsConstructor
public class TaskController {
    private final TaskService taskService;

    @PostMapping
    public TaskResponse createTask(@Valid @RequestBody TaskRequest request){
        return taskService.createTask(request);
    }

    @GetMapping
    public List<TaskResponse> getAllTasks(){
        return taskService.getAllTasks();
    }

    @GetMapping("/{id}")
    public TaskResponse getTaskById(@PathVariable Long id){
        return taskService.getTaskById(id);
    }

    @PutMapping("/{id}")
    public TaskResponse updateTask(
            @PathVariable Long id,
            @Valid @RequestBody TaskRequest request
    ){
        return taskService.updateTask(id, request);
    }
}
