package com.ebookstore.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "user")
public class User extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String first_name;
    private String last_name;
    @Column(unique = true)
    private String username;
    @Column(unique = true)
    private String email;
    private String password;
    private String mobile;
    private String verification_code;
    private String registered_date;
    @Column(name = "gender_id")
    private int genderId;
    @ManyToOne
    @JoinColumn(name = "gender_id",referencedColumnName = "id",insertable = false,updatable = false)
    private Gender gender;

    @Column(name = "status_id")
    private int statusId;
    @ManyToOne
    @JoinColumn(name = "status_id",referencedColumnName = "id",insertable = false,updatable = false)
    private Status status;

    public User() {
    }

    public User(int id, String first_name, String last_name, String username, String email, String password, String mobile, String verification_code, String registered_date, int genderId, Gender gender, int statusId, Status status) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.username = username;
        this.email = email;
        this.password = password;
        this.mobile = mobile;
        this.verification_code = verification_code;
        this.registered_date = registered_date;
        this.genderId = genderId;
        this.gender = gender;
        this.statusId = statusId;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getVerification_code() {
        return verification_code;
    }

    public void setVerification_code(String verification_code) {
        this.verification_code = verification_code;
    }

    public String getRegistered_date() {
        return registered_date;
    }

    public void setRegistered_date(String registered_date) {
        this.registered_date = registered_date;
    }

    public int getGenderId() {
        return genderId;
    }

    public void setGenderId(int genderId) {
        this.genderId = genderId;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
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
}
