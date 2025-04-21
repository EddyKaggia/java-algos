package com.eddykaggia.arrays;

import java.util.ArrayList;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + "(" + age + ")";
    }
}

public class GroupByDecade {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 5));
        people.add(new Person("Bob", 14));
        people.add(new Person("Charlie", 25));
        people.add(new Person("Daisy", 31));
        people.add(new Person("Eve", 22));
        people.add(new Person("Frank", 44));
        people.add(new Person("Grace", 37)); 

        int maxDecade = 10;

        ArrayList<Object> groups = new ArrayList<>();

        for(int i = 0; i < maxDecade; i++) {
            groups.add(new ArrayList<Person>());
        }
    }
}
