package com.francesca.pascalau.designpatterns.structural.facade;

public class Address {

    public String city;

    public Address() {

    }

    public Address(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
