package com.ecommerce.shoply.data.model;

public enum Currency {
    NGN("Naira"), USD("Dollar"), YEN("Yen"), GBP("British Pounds"), GHC("Cedis"), FRC("Franc");

    private String name;

    Currency(String s) {
        this.name = s;
    }
    private String getName(){
        return name;
    }
}
