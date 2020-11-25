package com.andrei.vehicleshop.models;

import com.andrei.vehicleshop.utils.Util;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;


@Entity
@Table(name = "rating")
@JsonIgnoreProperties({"hibernateLazyInitializer"})
public class Rating {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;
    private Integer oneStar;
    private Integer twoStars;
    private Integer threeStars;
    private Integer fourStars;
    private Integer fiveStars;
    private Double average;

    @OneToOne(mappedBy = "rating")
    private Vehicle vehicle;


    public Rating() {
        this.oneStar = 0;
        this.twoStars = 0;
        this.threeStars = 0;
        this.fourStars = 0;
        this.fiveStars = 0;
    }

    public Rating(Integer oneStar, Integer twoStars, Integer threeStars, Integer fourStars, Integer fiveStars) {
        this.oneStar = oneStar;
        this.twoStars = twoStars;
        this.threeStars = threeStars;
        this.fourStars = fourStars;
        this.fiveStars = fiveStars;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getOneStar() {
        return oneStar;
    }

    public void setOneStar(Integer oneStar) {
        this.oneStar = oneStar;
    }

    public Integer getTwoStars() {
        return twoStars;
    }

    public void setTwoStars(Integer twoStars) {
        this.twoStars = twoStars;
    }

    public Integer getThreeStars() {
        return threeStars;
    }

    public void setThreeStars(Integer threeStars) {
        this.threeStars = threeStars;
    }

    public Integer getFourStars() {
        return fourStars;
    }

    public void setFourStars(Integer fourStars) {
        this.fourStars = fourStars;
    }

    public Integer getFiveStars() {
        return fiveStars;
    }

    public void setFiveStars(Integer fiveStars) {
        this.fiveStars = fiveStars;
    }


    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Double getAverage() {
        return average;
    }

    public void setAverage(Double average) {
        this.average = average;
    }

}
