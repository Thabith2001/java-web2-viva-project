package com.ebookstore.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "book")
public class Book extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "category_id")
    private int categoryId;
    @ManyToOne
    @JoinColumn(name = "category_id",insertable = false,updatable = false)
    private Category category;
    @Column(name = "category_has_genre_id")
    private int categoryHasGenreId;
    @ManyToOne
    @JoinColumn(name = "category_has_genre_id",insertable = false,updatable = false)
    private CategoryHasGenre categoryHasGenre;
    private String title;
    private String overview;
    private String author;
    private String publisher;
    private LocalDate published_date;
    private String isbn;
    @Column(name = "language_id")
    private int languageId;
    @ManyToOne
    @JoinColumn(name = "language_id",insertable = false,updatable = false)
    private Language language;
    private int qty;
    private int page_count;
    private String description;
    private Double price;
    @Column(name = "status_id")
    private int statusId;
    @ManyToOne
    @JoinColumn(name = "status_id",insertable = false,updatable = false)
    private Status status;
    private Double delivery_fee;

    public Book() {
    }

    public Book(int id, int categoryId, Category category, int categoryHasGenreId, CategoryHasGenre categoryHasGenre, String title, String overview, String author, String publisher, LocalDate published_date, String isbn, int languageId, Language language, int qty, int page_count, String description, Double price, int statusId, Status status, Double delivery_fee) {
        this.id = id;
        this.categoryId = categoryId;
        this.category = category;
        this.categoryHasGenreId = categoryHasGenreId;
        this.categoryHasGenre = categoryHasGenre;
        this.title = title;
        this.overview = overview;
        this.author = author;
        this.publisher = publisher;
        this.published_date = published_date;
        this.isbn = isbn;
        this.languageId = languageId;
        this.language = language;
        this.qty = qty;
        this.page_count = page_count;
        this.description = description;
        this.price = price;
        this.statusId = statusId;
        this.status = status;
        this.delivery_fee = delivery_fee;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public int getCategoryHasGenreId() {
        return categoryHasGenreId;
    }

    public void setCategoryHasGenreId(int categoryHasGenreId) {
        this.categoryHasGenreId = categoryHasGenreId;
    }

    public CategoryHasGenre getCategoryHasGenre() {
        return categoryHasGenre;
    }

    public void setCategoryHasGenre(CategoryHasGenre categoryHasGenre) {
        this.categoryHasGenre = categoryHasGenre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public LocalDate getPublished_date() {
        return published_date;
    }

    public void setPublished_date(LocalDate published_date) {
        this.published_date = published_date;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getLanguageId() {
        return languageId;
    }

    public void setLanguageId(int languageId) {
        this.languageId = languageId;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getPage_count() {
        return page_count;
    }

    public void setPage_count(int page_count) {
        this.page_count = page_count;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getStatusId() {
        return statusId;
    }

    public void setStatusId(int statusId) {
        this.statusId = statusId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Double getDelivery_fee() {
        return delivery_fee;
    }

    public void setDelivery_fee(Double delivery_fee) {
        this.delivery_fee = delivery_fee;
    }
}
