package com.eddykaggia.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class ArrayLists {
    public static void main(String[] args) {
        // ArrayList = A resizable array that stores objects (autoboxing)
        //             Arrays are fixed in size, but ArrayLists can change

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Oranges");
        fruits.add("Grapes");
        fruits.add("Bananas");
        fruits.add("Limes");


        fruits.remove(1);
        fruits.set(0, "Pineapple");

        Collections.sort(fruits);


        for(String fruit: fruits){
            System.out.println(fruit);
        }


        Scanner scanner = new Scanner(System.in);

        ArrayList<String> foods = new ArrayList<>();

        System.out.print("Enter the amount of food you would like: ");
        int foodAmt = scanner.nextInt();
        scanner.nextLine();

        for(int i = 1; i <= foodAmt; i++) {
            System.out.print("Enter food amt" + i +": ");
            String food = scanner.nextLine();
            foods.add(food);
        }

        System.out.println(foods);
        scanner.close();
    }
}
