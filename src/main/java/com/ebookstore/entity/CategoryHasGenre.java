package com.ebookstore.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "category_has_genre")
public class CategoryHasGenre implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "genre_id")
    private int genreId;
    @ManyToOne
    @JoinColumn(name = "genre_id",insertable = false,updatable = false)
    private Genre genre;
    @Column(name = "category_id")
    private int categoryId;
    @ManyToOne
    @JoinColumn(name = "category_id",insertable = false,updatable = false)
    private Category category;

    public CategoryHasGenre() {
    }

    public CategoryHasGenre(int id, int genreId, Genre genre, int categoryId, Category category) {
        this.id = id;
        this.genreId = genreId;
        this.genre = genre;
        this.categoryId = categoryId;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGenreId() {
        return genreId;
    }

    public void setGenreId(int genreId) {
        this.genreId = genreId;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
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
}
