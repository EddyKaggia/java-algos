package com.arrays;

public class StringMethods {
    public static void main(String[] args) {

        String name = "Moiraine";

        int length = name.length();
        System.out.println("What is length of name: " +length);

        char letter = name.charAt(3);
        System.out.println("What is the char at index 3: " +letter);
    }
}
