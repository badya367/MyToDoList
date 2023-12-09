/**
 * Класс Task представляет собой модель данных для задач в приложении To-Do List.
 */

package com.mytodolist.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Task {
    private long id; //Уникальный идентификатор задачи
    private String title; //Заголовок задачи
    private String description; //Описание задачи
    private Date dueDate; //Дата, к которой должна быть выполнена задача
    private boolean completed; //Флаг, указывающий выполнена ли задача

    public Task() {} //Конструктор по умолчанию

    public Task(String title, String description, String dueDateString) { //Конструктор создаёт объект Task с заданными атрибутами

        this.title = title;
        this.description = description;
        //Преобразование строки в объект Date
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy. HH:mm");
        try {
            this.dueDate = dateFormat.parse(dueDateString);
        } catch (ParseException e) {
            System.out.println(e.getMessage());
        }
        this.completed = false;

    }

    public void markAsCompleted() { //метод для отметки задания как выполненого
        completed = true;
    }

    public boolean isOverdue() { //метод проверки просроченного задания
        return dueDate != null && dueDate.before(new Date());
    }

    /*
    --------------------
    Гетеры и сетеры для полей класса Task
    --------------------
     */
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDateString) {
        //Преобразование строки в объект Date
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy. HH:mm");
        try {
            this.dueDate = dateFormat.parse(dueDateString);
        } catch (ParseException e) {
            System.out.println(e.getMessage());
        }
    }

    public boolean getCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
