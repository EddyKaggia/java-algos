package numbers;

public class FactorialRecursive {
    public static int factorial(int num) {
        if (num <= 1) return 1;
        return num * factorial(num - 1);
    }

    public static void main(String [] args) {
        System.out.println(factorial(0));
        System.out.println(factorial(4));
        System.out.println(factorial(9));
    }
}
