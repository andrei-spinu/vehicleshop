package com.andrei.vehicleshop.models;

import com.andrei.vehicleshop.enums.FuelType;
import com.andrei.vehicleshop.enums.Transmission;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@PrimaryKeyJoinColumn(name = "id")
@Table(name = "trucks")
public class Truck extends Vehicle{

    private Transmission transmission;
    private Integer horsePower;
    private FuelType FuelType;
    private String wheelFormula;

    public Truck() {
    }

    public Truck(String vehicleType, String brand, String model, Long price,
                 String description, String color, Transmission transmission,
                 Integer horsePower, com.andrei.vehicleshop.enums.FuelType fuelType,
                 String wheelFormula) {
        super(vehicleType, brand, model, price, description, color);
        this.transmission = transmission;
        this.horsePower = horsePower;
        FuelType = fuelType;
        this.wheelFormula = wheelFormula;
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
    public com.andrei.vehicleshop.enums.FuelType getFuelType() {
        return FuelType;
    }
    public void setFuelType(com.andrei.vehicleshop.enums.FuelType fuelType) {
        FuelType = fuelType;
    }
    public String getWheelFormula() {
        return wheelFormula;
    }
    public void setWheelFormula(String wheelFormula) {
        this.wheelFormula = wheelFormula;
    }
}
