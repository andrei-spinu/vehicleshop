package com.andrei.vehicleshop.models;

import com.andrei.vehicleshop.enums.BicycleShape;
import com.andrei.vehicleshop.enums.FrameMaterial;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import java.awt.*;

@Entity
@PrimaryKeyJoinColumn(name = "id")
@Table(name = "bicycles")
public class Bicycle extends Vehicle{

    private Integer weight;
    private FrameMaterial frameMaterial;
    private BicycleShape bicycleShape;

    public Bicycle() {
    }

    public Bicycle(String vehicleType, String brand, String model, Long price,
                   String description, String color, Integer weight, FrameMaterial frameMaterial,
                   BicycleShape bicycleShape) {
        super(vehicleType, brand, model, price, description, color);
        this.weight = weight;
        this.frameMaterial = frameMaterial;
        this.bicycleShape = bicycleShape;
    }

    public Integer getWeight() {
        return weight;
    }
    public void setWeight(Integer weight) {
        this.weight = weight;
    }
    public FrameMaterial getFrameMaterial() {
        return frameMaterial;
    }
    public void setFrameMaterial(FrameMaterial frameMaterial) {
        this.frameMaterial = frameMaterial;
    }
    public BicycleShape getBicycleShape() {
        return bicycleShape;
    }
    public void setBicycleShape(BicycleShape bicycleShape) {
        this.bicycleShape = bicycleShape;
    }
}
