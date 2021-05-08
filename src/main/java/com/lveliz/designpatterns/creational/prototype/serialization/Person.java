package com.lveliz.designpatterns.creational.prototype.serialization;

import java.io.Serializable;
import java.util.Arrays;

public class Person implements Serializable {

    private static final long serialVersionUID = 42L;

    private String[] names;
    private Address address;
    

    public Person(String[] names, Address address) {
        this.names = names;
        this.address = address;
    }

    public Person() {
    }

    public String[] getNames() {
        return this.names;
    }

    public void setName(String[] names) {
        this.names = names;
    }

    public Address getAddress() {
        return this.address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" + "names=" + Arrays.toString(names) + ", address=" + address + '}';
    }

}
