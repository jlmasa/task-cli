package com.jlmasa.tasks;

import java.util.*;

public class InMemoryTaskRepository implements TaskRepository{
    private final Map<UUID, Task> store = new LinkedHashMap<>();

    public List<Task> findAll() { return list.copyOf(store.values());}

    public Optional<Task> findById(UUID id) {
        return Optional.ofNullable(store.get(id));
    }
    public void save(Task t) {store.put(t.id(), t)}
    public boolean deleteBy(UUID id) {return store.remove(id) != null;}
}