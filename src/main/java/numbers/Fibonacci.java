package numbers;

import java.util.Arrays;

public class Fibonacci {
    public static int fib(int input) {
        if (input == 0) return 0;
        if (input == 1) return 1;

        return fib(input - 2) + fib(input -1);
    }

    public static int[] fibonacci(int n) {
        int[] fibArray = new int[n];

        for (int i = 0; i < n; i++) {
            fibArray[i] = fib(i);
            System.out.println("Current fibonacci number is: " + fib(i));
        }

        System.out.println(Arrays.toString(fibArray));

        return fibArray;
    }

    public static void main (String [] args) {
        System.out.println(fibonacci(10));
        System.out.println(fibonacci(7));
        System.out.println(fibonacci(19));
    }
}
