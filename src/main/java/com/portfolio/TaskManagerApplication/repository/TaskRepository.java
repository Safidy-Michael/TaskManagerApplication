package com.portfolio.TaskManagerApplication.repository;

import com.portfolio.TaskManagerApplication.model.Task;
import com.portfolio.TaskManagerApplication.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByUser(User user);
}
