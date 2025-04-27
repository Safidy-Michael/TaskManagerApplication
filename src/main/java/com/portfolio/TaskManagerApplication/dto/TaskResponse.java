package com.portfolio.TaskManagerApplication.dto;


import com.portfolio.TaskManagerApplication.model.Priority;
import com.portfolio.TaskManagerApplication.model.Status;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TaskResponse {
    private Long id;
    private String title;
    private String description;
    private Priority priority;
    private Status status;
    private LocalDate deadline;
}