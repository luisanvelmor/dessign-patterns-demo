package com.lveliz.designpatterns.creational.prototype.serialization;

import java.io.Serializable;

public class Address implements Serializable {

    private static final long serialVersionUID = 42L;

    private String streetName;
    private int houseNumber;

    public Address() {
    }

    public Address(String streetName, int houseNumber) {
        this.streetName = streetName;
        this.houseNumber = houseNumber;
    }

    public String getStreetName() {
        return this.streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public int getHouseNumber() {
        return this.houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    @Override
    public String toString() {
        return "Address{" + "streetName=" + streetName + ", houseNumber=" + houseNumber + '}';
    }

}
