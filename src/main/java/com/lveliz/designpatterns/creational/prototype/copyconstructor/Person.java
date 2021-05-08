package com.lveliz.designpatterns.creational.prototype.copyconstructor;

public class Person {

    private Address address;
    private String name;

    public Person() {
    }

    public Person(Person other) {
        this.address = new Address(other.getAddress());
        this.name = other.name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{name='" + this.name + "', address=" + this.address + "}";
    }

}
