package com.ebookstore.entity;


import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "message")
public class Message implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "user_id")
    private int userId;
    @ManyToOne
    @JoinColumn(name = "user_id",insertable = false,updatable = false)
    private User user;
    private String content;
    private LocalDate date_time_added;
    private String subject;

    public Message() {
    }

    public Message(int id, int userId, User user, String content, LocalDate date_time_added, String subject) {
        this.id = id;
        this.userId = userId;
        this.user = user;
        this.content = content;
        this.date_time_added = date_time_added;
        this.subject = subject;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDate getDate_time_added() {
        return date_time_added;
    }

    public void setDate_time_added(LocalDate date_time_added) {
        this.date_time_added = date_time_added;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
