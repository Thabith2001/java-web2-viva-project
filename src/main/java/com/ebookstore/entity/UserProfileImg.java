package com.ebookstore.entity;
import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "user_profile_img")
public class UserProfileImg implements Serializable {
    @Id
    @Column(unique = true)
    private String code;
    @Column(name = "user_id")
    private int userId;

    @ManyToOne
    @JoinColumn(name = "user_id",insertable = false,updatable = false)
    private User user;

    public UserProfileImg() {
    }

    public UserProfileImg(String code, int userId, User user) {
        this.code = code;
        this.userId = userId;
        this.user = user;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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
}
