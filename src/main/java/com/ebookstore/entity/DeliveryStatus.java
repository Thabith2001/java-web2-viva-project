package com.ebookstore.entity;


import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "delivery_status")
public class DeliveryStatus implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    public DeliveryStatus() {
    }

    public DeliveryStatus(int id, String name) {
        this.id = id;
        this.name = name;
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
}
