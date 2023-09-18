package com.ebookstore.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "city")
public class City implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String postal_code;
    @Column(name = "district_id")
    private int districtId;
    @ManyToOne
    @JoinColumn(name = "district_id",insertable = false,updatable = false)
    private District district;

    public City() {
    }

    public City(int id, String name, String postal_code, int districtId, District district) {
        this.id = id;
        this.name = name;
        this.postal_code = postal_code;
        this.districtId = districtId;
        this.district = district;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPostal_code() {
        return postal_code;
    }

    public void setPostal_code(String postal_code) {
        this.postal_code = postal_code;
    }

    public int getDistrictId() {
        return districtId;
    }

    public void setDistrictId(int districtId) {
        this.districtId = districtId;
    }

    public District getDistrict() {
        return district;
    }

    public void setDistrict(District district) {
        this.district = district;
    }
}
