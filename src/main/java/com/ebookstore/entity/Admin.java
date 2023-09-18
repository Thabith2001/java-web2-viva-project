package com.ebookstore.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "admin")
public class Admin implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String first_name;
    private String last_name;
    @Column(unique = true)
    private String email;
    private String password;
    private String mobile;
    @Column(name = "gender_id")
    private int genderId;
    @ManyToOne
    @JoinColumn(name = "gender_id",referencedColumnName = "id",insertable = false,updatable = false)
    private Gender gender;
    private String verification_code;

    public Admin() {
    }

    public Admin(int id, String first_name, String last_name, String email, String password, String mobile, int genderId, Gender gender, String verification_code) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.password = password;
        this.mobile = mobile;
        this.genderId = genderId;
        this.gender = gender;
        this.verification_code = verification_code;
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

    public String getVerification_code() {
        return verification_code;
    }

    public void setVerification_code(String verification_code) {
        this.verification_code = verification_code;
    }
}
