package com.example.devops_001_hello1.controller;

import org.springframework.boot.autoconfigure.graphql.GraphQlProperties;
import org.springframework.boot.autoconfigure.task.TaskExecutionProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

// http://localhost:8080/


@RestController
@RequestMapping
public class Devopscontroller {

    private final TaskExecutionProperties taskExecutionProperties;

    public Devopscontroller(TaskExecutionProperties taskExecutionProperties) {
        this.taskExecutionProperties = taskExecutionProperties;
    }

    @GetMapping
    public String devopsHello() {
        return "Devops Hello :" + LocalDate.now();


    }


}
