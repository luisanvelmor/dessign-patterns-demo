package com.lveliz.designpatterns.creational.prototype.clonable;

public class PrototypeDemo {

    public static void main(String[] args) throws CloneNotSupportedException {

        // FORMA NO RECOMENDADA
        Person luis = new Person(new String[]{"Luis", "Veliz"}, new Address("10", 1931));
        Person antonio = (Person) luis.clone();

        antonio.setName(new String[]{"Antonio", "Morales"});
        antonio.getAddress().setHouseNumber(1795);

        System.out.println("\nClone Through Clonable Interface");
        System.out.println(luis);
        System.out.println(antonio);

    }

}
