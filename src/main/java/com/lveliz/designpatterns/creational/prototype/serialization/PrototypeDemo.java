package com.lveliz.designpatterns.creational.prototype.serialization;

import org.apache.commons.lang3.SerializationUtils;

/**
 *
 * @author Luis Veliz
 */
public class PrototypeDemo {

    public static void main(String[] args) {

        Person luis = new Person(new String[]{"Luis", "Veliz"}, new Address("10", 1931));
        Person antonio = SerializationUtils.roundtrip(luis);

        antonio.setName(new String[]{"antonio", "Morales"});
        antonio.getAddress().setHouseNumber(1795);

        System.out.println("\nClone Through Serialization");
        System.out.println(luis);
        System.out.println(antonio);
    }

}
