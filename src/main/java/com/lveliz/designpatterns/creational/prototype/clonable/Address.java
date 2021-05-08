package com.lveliz.designpatterns.creational.prototype.clonable;

public class Address implements Cloneable {

    private String streetName;
    private int houseNumber;

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

    @Override
    public Object clone() throws CloneNotSupportedException {
        return new Address(this.streetName, this.houseNumber);
    }

}
