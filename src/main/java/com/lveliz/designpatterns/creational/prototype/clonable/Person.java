package com.lveliz.designpatterns.creational.prototype.clonable;

import java.util.Arrays;

public class Person implements Cloneable {

    private String[] names;
    private Address address;

    public Person(String[] names, Address address) {
        this.names = names;
        this.address = address;
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

    @Override
    public Object clone() throws CloneNotSupportedException {
        return new Person(names.clone(), (Address) this.address.clone());
    }

}
