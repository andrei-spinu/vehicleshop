package com.andrei.vehicleshop.controllers;

import com.andrei.vehicleshop.models.Vehicle;
import com.andrei.vehicleshop.repositories.VehicleRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/vehicles")
public class VehicleController {

    private VehicleRepository vehicleRepository;

    public VehicleController(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    @PostMapping
    public void addVehicle(@RequestBody Vehicle vehicle){
        vehicleRepository.save(vehicle);
    }

    @GetMapping
    public List<Vehicle> getAllVehicles(){
        return vehicleRepository.findAll();
    }

    @GetMapping(value = "/{id}")
    public Vehicle getVehicleById(@PathVariable("id") String id){
        return getVehicleById(id);
    }
}
