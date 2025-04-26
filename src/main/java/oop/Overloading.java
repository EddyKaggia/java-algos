package oop;

class Person {
    Person() {
        System.out.println("Default constructor called");
    }

    Person (String name) {
        System.out.println("My name is: " + name);
    }
}

public class Overloading {
    public static void main(String [] args) {
        Person dan = new Person("Dan");

        System.out.println(dan);
    }
}
