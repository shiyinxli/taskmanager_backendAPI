package com.shiyinxli.taskmanager.dto;

import com.shiyinxli.taskmanager.entity.TaskStatus;
import lombok.Data;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDate;

@Data
public class TaskRequest {
    @NotBlank(message = "Title must not be empty")
    private String title;
    private String description;
    private TaskStatus status;
    private LocalDate dueDate;
}
