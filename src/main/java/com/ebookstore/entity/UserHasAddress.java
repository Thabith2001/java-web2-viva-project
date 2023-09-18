package com.ebookstore.entity;


import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "user_has_address")
public class UserHasAddress implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "user_id")
    private int userId;
    @ManyToOne
    @JoinColumn(name = "user_id",insertable = false,updatable = false)
    private User user;
    private String line1;
    private String line2;
    @Column(name = "city_id")
    private int cityId;
    @ManyToOne
    @JoinColumn(name = "city_id",insertable = false,updatable = false)
    private City city;

    public UserHasAddress() {
    }

    public UserHasAddress(int id, int userId, User user, String line1, String line2, int cityId, City city) {
        this.id = id;
        this.userId = userId;
        this.user = user;
        this.line1 = line1;
        this.line2 = line2;
        this.cityId = cityId;
        this.city = city;
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

    public String getLine1() {
        return line1;
    }

    public void setLine1(String line1) {
        this.line1 = line1;
    }

    public String getLine2() {
        return line2;
    }

    public void setLine2(String line2) {
        this.line2 = line2;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}
