package numbers;

public class Fibonacci {
    public static void main (String [] args) {
        int n = 10; // you can change this to any number of terms
        int first = 0;
        int second = 1;

        // print the first n Fibonacci numbers
        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }
}
