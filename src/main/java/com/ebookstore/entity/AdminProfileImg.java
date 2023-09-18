package com.ebookstore.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "admin_profile_img")
public class AdminProfileImg implements Serializable {
    @Id
    @Column(unique = true)
    private String code;
    @Column(name = "admin_id")
    private int adminId;

    @ManyToOne
    @JoinColumn(name = "admin_id",insertable = false,updatable = false)
    private Admin admin;

    public AdminProfileImg() {
    }

    public AdminProfileImg(String code, int adminId, Admin admin) {
        this.code = code;
        this.adminId = adminId;
        this.admin = admin;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }
}
