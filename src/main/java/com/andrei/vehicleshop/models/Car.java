package com.andrei.vehicleshop.models;

import com.andrei.vehicleshop.enums.CarShape;
import com.andrei.vehicleshop.enums.FuelType;
import com.andrei.vehicleshop.enums.Transmission;

import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@PrimaryKeyJoinColumn(name = "id")
@Table(name = "cars")
public class Car extends Vehicle implements Serializable {

    private Integer topSpeed;
    private FuelType fuelType;
    private Integer cubicCapacity;
    private  Transmission transmission;
    private CarShape carShape;

    public Car(String vehicleType, String brand, String model,
               Long price, String description, String color,
               Integer topSpeed, FuelType fuelType, Integer cubicCapacity,
               Transmission transmission, CarShape carShape) {
        super(vehicleType, brand, model, price, description, color);
        this.topSpeed = topSpeed;
        this.fuelType = fuelType;
        this.cubicCapacity = cubicCapacity;
        this.transmission = transmission;
        this.carShape = carShape;
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
    public Transmission getTransmission() {
        return transmission;
    }
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }
    public CarShape getCarShape() {
        return carShape;
    }
    public void setCarShape(CarShape carShape) {
        this.carShape = carShape;
    }
}
