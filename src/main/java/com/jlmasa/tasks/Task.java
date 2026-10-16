package com.jlmasa.tasks;

import java.time.LocalDate;
import java.util.UUID;

public record Task(UUID id, String title, Priority priority, LocalDate dueDate, boolean done) {
    public Task{
        if(title == null || title.isBlank()){
            throw new IllegalArgumentException("title must not be blank")
        }
    }
    public static Task create(String title, Priority priority, LocalDate dueDate){
        return new Task(UUID.randomUUID(), title, priority, dueDate, false)
    }
    public Task Complete(){
        return new Task(id, title, priority, dueDate, true)
    }
}