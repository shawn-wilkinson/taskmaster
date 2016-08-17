package com.allstate.models;

import java.util.Date;

/**
 * Created by localadmin on 8/17/16.
 */
public class Task {
    private int id;
    private String name;
    private String category;
    private Date due;
    private boolean isComplete;
    private Date createdAt;
    private Date updatedAt;

    public Task() {
        this.createdAt = new Date();
        this.updatedAt = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return this.category;
    }

    public void setDue(Date due) {
        this.due = due;
    }

    public Date getDue() {
        return this.due;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void setComplete(boolean complete) {
        isComplete = complete;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    protected Date updateTime(){
        return new Date();
    }
}
