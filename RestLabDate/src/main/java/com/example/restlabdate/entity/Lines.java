package com.example.restlabdate.entity;

import jakarta.persistence.*;

@Entity
@Table(name="line")
public class Lines {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long productId;
    private String productName;

    public Lines() {
    }

    public Lines(long productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "Lines{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                '}';
    }
}
