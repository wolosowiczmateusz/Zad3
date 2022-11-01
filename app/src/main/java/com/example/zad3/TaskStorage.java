package com.example.zad3;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class TaskStorage {

    private static final TaskStorage taskStorage = new TaskStorage();

    private final List<Task> tasks;

    public static TaskStorage getInstance(){return taskStorage;}

    private TaskStorage(){
        tasks = new ArrayList<>();
        for(int i = 1;i<=150;i++){
            Task task = new Task();
            task.setName("Pilne zadanie numer " + i + " Data: ");
            task.setDone(i%3 == 0);
            tasks.add(task);
        }
    }

    public List<Task> getTasks(){
        return tasks;
    }

    public Task getTask(UUID taskId){
        Task task = new Task();
        for(Task t : tasks){
            if(t.getId().equals(taskId)) task = t;
        }
        return task;
    }

}
