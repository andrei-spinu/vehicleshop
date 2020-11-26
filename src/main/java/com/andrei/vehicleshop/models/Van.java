package com.andrei.vehicleshop.models;

import com.andrei.vehicleshop.enums.FuelType;
import com.andrei.vehicleshop.enums.Transmission;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@PrimaryKeyJoinColumn(name = "id")
@Table(name = "vans")
public class Van extends Vehicle{

    private Transmission transmission;
    private Integer horsePower;
    private FuelType fuelType;

    public Van() {
    }

    public Van(String vehicleType, String brand, String model, Long price, String description, String color, Transmission transmission, Integer horsePower, FuelType fuelType) {
        super(vehicleType, brand, model, price, description, color);
        this.transmission = transmission;
        this.horsePower = horsePower;
        this.fuelType = fuelType;
    }

    public Transmission getTransmission() {
        return transmission;
    }
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }
    public Integer getHorsePower() {
        return horsePower;
    }
    public void setHorsePower(Integer horsePower) {
        this.horsePower = horsePower;
    }
    public FuelType getFuelType() {
        return fuelType;
    }
    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }
}
