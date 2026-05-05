package com.shiyinxli.taskmanager.repository;

import com.shiyinxli.taskmanager.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
