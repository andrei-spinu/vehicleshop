package com.andrei.vehicleshop.utils;

public class Util {
    public static Double getAverage(Integer first,Integer second,Integer third, Integer fourth, Integer fifth){
        Double sum = Double.valueOf(first+second+third+fourth+fifth);
        return sum/5;
    }
}
