package com.andrei.vehicleshop.services;

import com.andrei.vehicleshop.models.Rating;
import com.andrei.vehicleshop.repositories.RatingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RatingService {
    List<Rating> getAllRatings();
    void addRating(Rating rating);
    Rating getRatingById(Long id);
    void updateRating(Long id, Rating rating);
}
