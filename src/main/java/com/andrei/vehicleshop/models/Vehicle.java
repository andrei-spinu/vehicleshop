package com.andrei.vehicleshop.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;
import java.util.UUID;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Table(name = "vehicles")
public class Vehicle extends DateAudit implements Serializable {
    @Id
    @GeneratedValue()
    private Long id;
    @Column(name = "vehicle_type", nullable = false)
    private String vehicleType;
    @Column(name = "brand", nullable = false)
    private String brand;
    @Column(name = "model", nullable = false)
    private String model;
    @Column(name = "price", nullable = false)
    private Long price;
    @Column(name = "description")
    private String description;
    @Column(name = "color")
    private String color;


    @OneToMany(mappedBy = "vehicle", fetch = FetchType.LAZY)
    private Set<FileModel> fileModels;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "rating_id", referencedColumnName = "id")
    private Rating rating;


    public Vehicle() {
    }

    public Vehicle(String vehicleType, String brand, String model, Long price, String description, String color) {
        this.vehicleType = vehicleType;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.description = description;
        this.color = color;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getVehicleType() {
        return vehicleType;
    }
    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public Long getPrice() {
        return price;
    }
    public void setPrice(Long price) {
        this.price = price;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Set<FileModel> getFileModels() {
        return fileModels;
    }
    public void setFileModels(Set<FileModel> fileModels) {
        this.fileModels = fileModels;
    }
    public Rating getRating() {
        return rating;
    }
    public void setRating(Rating rating) {
        this.rating = rating;
    }
}
