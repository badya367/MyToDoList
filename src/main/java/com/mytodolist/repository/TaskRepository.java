package com.mytodolist.repository;

import com.mytodolist.model.Task;

import java.util.List;

public interface TaskRepository {
    Task save (Task task);
    Task findById (long id);
    List<Task> findAll();
    List<Task> findByCompleted (boolean completed);
    void update(Task task);
    void delete(long id);
}
