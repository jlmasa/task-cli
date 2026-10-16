package com.jlmasa.tasks;

import java.util.*;

public interface TaskRepository {
    List<Task> findAll();
    Optional<Task> findById(UUID id);
    void same(Task task);
    boolean deleteById(UUID id);
}