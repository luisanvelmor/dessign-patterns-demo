package com.lveliz.designpatterns.creational.prototype.copyconstructor;

public class Address {

    private String streetAddress;
    private String city;
    private String country;

    public Address() {
    }

    public Address(Address other) {
        this.streetAddress = other.getStreetAddress();
        this.city = other.getCity();
        this.country = other.getCountry();
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{streetAddress='" + this.streetAddress + "', city='" + this.city + "', country='" + country + "'}";
    }

}
