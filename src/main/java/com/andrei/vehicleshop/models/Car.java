package com.andrei.vehicleshop.models;

import com.andrei.vehicleshop.enums.FuelType;
import com.andrei.vehicleshop.enums.Transmission;

import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@PrimaryKeyJoinColumn(name = "car_id")
@Table(name = "cars")
public class Car extends Vehicle implements Serializable {

    private Integer topSpeed;
    private FuelType fuelType;
    private Integer cubicCapacity;
    private Integer mileage;
    private Transmission transmission;

    public Car() {
    }

    public Car(String vehicleType, String brand, String model, Long price, String description, Rating rating, Integer topSpeed, FuelType fuelType, Integer cubicCapacity, Integer mileage, Transmission transmission) {
        super(vehicleType, brand, model, price, description, rating);
        this.topSpeed = topSpeed;
        this.fuelType = fuelType;
        this.cubicCapacity = cubicCapacity;
        this.mileage = mileage;
        this.transmission = transmission;
    }

    public Integer getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(Integer topSpeed) {
        this.topSpeed = topSpeed;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public Integer getCubicCapacity() {
        return cubicCapacity;
    }

    public void setCubicCapacity(Integer cubicCapacity) {
        this.cubicCapacity = cubicCapacity;
    }

    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }
}
