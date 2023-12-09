package com.mytodolist;

import com.mytodolist.model.Task;

import java.util.Date;

public class Application {

    public static void main(String[] args) {
        System.out.println("В этом проекте будет реализован мой список дел");

        Task testTask = new Task("Задача 1", "Тестовая задача", "10.12.2023. 11:00");
        testTask.setDueDate("13.12.2023. 11:00");
        System.out.println(testTask.getDueDate());
    }
}
