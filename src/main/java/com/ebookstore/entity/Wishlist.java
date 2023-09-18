package com.ebookstore.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "wishlist")
public class Wishlist implements Serializable {
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

    public Wishlist() {
    }

    public Wishlist(int id, int userId, User user, int bookId, Book book) {
        this.id = id;
        this.userId = userId;
        this.user = user;
        this.bookId = bookId;
        this.book = book;
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
}
