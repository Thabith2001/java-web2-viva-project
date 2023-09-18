package com.ebookstore.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "invoice")
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int order_id;
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
    private LocalDate date_time_added;
    private double total;
    private int qty;
    @Column(name = "delivery_status_id")
    private int deliveryStatusId;
    @ManyToOne
    @JoinColumn(name = "delivery_status_id",insertable = false,updatable = false)
    private DeliveryStatus deliveryStatus;

    public Invoice() {
    }

    public Invoice(int id, int order_id, int userId, User user, int bookId, Book book, LocalDate date_time_added, double total, int qty, int deliveryStatusId, DeliveryStatus deliveryStatus) {
        this.id = id;
        this.order_id = order_id;
        this.userId = userId;
        this.user = user;
        this.bookId = bookId;
        this.book = book;
        this.date_time_added = date_time_added;
        this.total = total;
        this.qty = qty;
        this.deliveryStatusId = deliveryStatusId;
        this.deliveryStatus = deliveryStatus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
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

    public LocalDate getDate_time_added() {
        return date_time_added;
    }

    public void setDate_time_added(LocalDate date_time_added) {
        this.date_time_added = date_time_added;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getDeliveryStatusId() {
        return deliveryStatusId;
    }

    public void setDeliveryStatusId(int deliveryStatusId) {
        this.deliveryStatusId = deliveryStatusId;
    }

    public DeliveryStatus getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(DeliveryStatus deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }
}
