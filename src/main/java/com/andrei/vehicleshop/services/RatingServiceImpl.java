package com.andrei.vehicleshop.services;

import com.andrei.vehicleshop.models.Rating;
import com.andrei.vehicleshop.repositories.RatingRepository;
import com.andrei.vehicleshop.utils.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RatingServiceImpl implements RatingService{

    private RatingRepository ratingRepository;

    @Autowired
    public RatingServiceImpl(RatingRepository ratingRepository) {
        this.ratingRepository = ratingRepository;
    }

    @Override
    public List<Rating> getAllRatings() {
        return ratingRepository.findAll();
    }

    @Override
    public void addRating(Rating rating) {
        rating.setAverage(Util.getAverage(rating.getOneStar(),rating.getTwoStars(),rating.getThreeStars(),rating.getFourStars(),rating.getFiveStars()));
        ratingRepository.save(rating);
    }

    @Override
    public Rating getRatingById(Long id) {
        return ratingRepository.getOne(id);
    }

    @Override
    public void updateRating(Long id, Rating rating) {
        Rating updatedRating = ratingRepository.getOne(id);

        updatedRating.setOneStar(rating.getOneStar());
        updatedRating.setTwoStars(rating.getTwoStars());
        updatedRating.setThreeStars(rating.getThreeStars());
        updatedRating.setFourStars(rating.getFourStars());
        updatedRating.setFiveStars(rating.getFiveStars());

        ratingRepository.save(updatedRating);
    }

    @Override
    public void deleteById(Long id) {
        ratingRepository.deleteById(id);
    }

    @Override
    public void deleteAll() {
        ratingRepository.deleteAll();
    }


}
