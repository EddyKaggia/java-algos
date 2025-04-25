package oop;

class Animal {
    void move() {
        System.out.println("Animal walks!");
    }

    void makeSound () {
        System.out.println("Animal makes a sound!");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof!");
    }


}

public class Inheritance {
    public static void main(String[] args) {
        Dog spaniel = new Dog();
        spaniel.makeSound();
    }
}
