package com.andrei.vehicleshop.controllers;

import com.andrei.vehicleshop.models.Rating;
import com.andrei.vehicleshop.services.RatingService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rating")
public class RatingController {

    private RatingService ratingService;

    public RatingController(RatingService ratingService) {
        this.ratingService = ratingService;
    }

    @PostMapping
    public void addRating(@RequestBody  Rating rating){

        ratingService.addRating(rating);
    }

   @GetMapping
    public List<Rating> getAllRatings(){
        return ratingService.getAllRatings();
   }

   @GetMapping(value = "/{id}")
    public Rating getRatingById(@PathVariable("id") Long id){
        return ratingService.getRatingById(id);
   }

   @PutMapping("/{id}")
   @ResponseStatus(HttpStatus.ACCEPTED)
   public void updateRating(@PathVariable("id") Long id, Rating rating){
        ratingService.updateRating(id,rating);
   }

   @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Long id){
        ratingService.deleteById(id);
   }

   @DeleteMapping
    public void deleteAll(){
        ratingService.deleteAll();
   }
}
