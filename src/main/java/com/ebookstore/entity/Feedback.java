package com.ebookstore.entity;


import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "feedback")
public class Feedback implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "user_id")
    private int userId;
    @ManyToOne
    @JoinColumn(name = "user_id",insertable = false,updatable = false)
    private User user;
    @Column(name = "book_id")
    private int bookId;
    @ManyToOne
    @JoinColumn(name = "book_id",insertable = false,updatable = false)
    private Book book;
    private String feed;
    private LocalDate date_time_added;
    private String title;

    public Feedback() {
    }

    public Feedback(int id, int userId, User user, int bookId, Book book, String feed, LocalDate date_time_added, String title) {
        this.id = id;
        this.userId = userId;
        this.user = user;
        this.bookId = bookId;
        this.book = book;
        this.feed = feed;
        this.date_time_added = date_time_added;
        this.title = title;
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

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String getFeed() {
        return feed;
    }

    public void setFeed(String feed) {
        this.feed = feed;
    }

    public LocalDate getDate_time_added() {
        return date_time_added;
    }

    public void setDate_time_added(LocalDate date_time_added) {
        this.date_time_added = date_time_added;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
