package com.andrei.vehicleshop.models;

import com.andrei.vehicleshop.enums.MotorcycleShape;
import com.andrei.vehicleshop.enums.Transmission;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@PrimaryKeyJoinColumn(name = "id")
@Table(name = "motorcycles")
public class Motorcycle extends Vehicle{
    private MotorcycleShape motorcycleShape;
    private Integer cubicCapacity;
    private Transmission transmission;

    public Motorcycle() {
    }

    public Motorcycle(String vehicleType, String brand, String model, Long price,
                      String description, String color, MotorcycleShape motorcycleShape,
                      Integer cubicCapacity, Transmission transmission) {
        super(vehicleType, brand, model, price, description, color);
        this.motorcycleShape = motorcycleShape;
        this.cubicCapacity = cubicCapacity;
        this.transmission = transmission;
    }

    public MotorcycleShape getMotorcycleShape() {
        return motorcycleShape;
    }
    public void setMotorcycleShape(MotorcycleShape motorcycleShape) {
        this.motorcycleShape = motorcycleShape;
    }
    public Integer getCubicCapacity() {
        return cubicCapacity;
    }
    public void setCubicCapacity(Integer cubicCapacity) {
        this.cubicCapacity = cubicCapacity;
    }
    public Transmission getTransmission() {
        return transmission;
    }
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }
}
