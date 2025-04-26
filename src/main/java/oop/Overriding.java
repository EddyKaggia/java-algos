package oop;

class Calculator {
    int add(int a, int b) {return a + b;}
    int add(int a, int b, int c) {return a + b + c;}
}

class AdvancedCalculator extends Calculator {
    @Override
    int add(int a, int b) {
        return a + b + 1;
    }
}

public class Overriding {
    public static void main(String [] args) {
        AdvancedCalculator price = new AdvancedCalculator();
        System.out.println(price.add(4, 6));
    }
}
