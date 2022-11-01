package com.example.zad3;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;
import java.util.zip.DataFormatException;

public class Task {

    private UUID id;
    private String name;
    private Date date;
    private boolean done;

    public Task(){
        id = UUID.randomUUID();
        date = new Date();
    }

    public boolean isDone(){
        return done;
    }

    public Date getDate(){
        return date;

    }

    public void setDone(boolean isChecked){
        if (isChecked == true){
            done = true;
        }
        else done = false;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public UUID getId(){
        return id;
    }

}
