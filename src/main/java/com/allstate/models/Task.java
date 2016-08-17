package com.allstate.models;

import com.allstate.CustomDateSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tasks")
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

    @Id
    @GeneratedValue
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

    @Temporal(TemporalType.DATE)
    public void setDue(Date due) {
        this.due = due;
    }
    @JsonSerialize(using = CustomDateSerializer.class)
    public Date getDue() {
        return this.due;
    }

    @Column(name = "is_complete", columnDefinition = "BIT", length = 1)
    public boolean isComplete() {
        return isComplete;
    }
    public void setComplete(boolean complete) {
        isComplete = complete;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at", insertable = true, updatable = false)
    public Date getCreatedAt() {
        return createdAt;
    }
    @JsonSerialize(using = CustomDateSerializer.class)
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_at")
    @JsonSerialize(using = CustomDateSerializer.class)
    public Date getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @PreUpdate
    protected void updateTime(){
        this.updatedAt = new Date();
    }
}
