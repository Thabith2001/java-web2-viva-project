package com.ebookstore.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "pdf")
public class Pdf implements Serializable {
    @Id
    @Column(unique = true)
    private String code;
    @Column(name = "book_id")
    private int bookId;
    @ManyToOne
    @JoinColumn(name = "book_id",insertable = false,updatable = false)
    private Book book;

    public Pdf() {
    }

    public Pdf(String code, int bookId, Book book) {
        this.code = code;
        this.bookId = bookId;
        this.book = book;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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
