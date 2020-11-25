package com.andrei.vehicleshop.controllers;

import com.andrei.vehicleshop.models.Car;
import com.andrei.vehicleshop.repositories.CarRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarController {

    private CarRepository carRepository;

    public CarController(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @PostMapping
    public void addVehicle(@RequestBody Car car){
        carRepository.save(car);
    }

    @GetMapping
    public List<Car> getAllVehicles(){
        return carRepository.findAll();
    }
}
