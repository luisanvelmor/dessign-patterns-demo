package com.lveliz.designpatterns.creational.prototype.copyconstructor;

public class PrototypeDemo {

    public static void main(String[] args) {

        Address address = new Address();
        address.setStreetAddress("streetAddress");
        address.setCity("city");
        address.setCountry("country");

        Person luis = new Person();
        luis.setAddress(address);
        luis.setName("Luis");

        Person antonio = new Person(luis);
        antonio.getAddress().setStreetAddress("streetAddress2");
        antonio.getAddress().setCity("city2");
        antonio.getAddress().setCountry("country2");
        antonio.setName("Antonio");

        System.out.println("\nClone Through Copy Constructor");
        System.out.println(luis);
        System.out.println(antonio);

    }

}
