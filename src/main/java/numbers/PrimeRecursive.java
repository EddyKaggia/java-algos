package numbers;

public class PrimeRecursive {
    public static Boolean isPrime(int input, int divisor) {
        if (input <= 1) return false;
        if (divisor == 1) return true;
        if (input % divisor == 0) return false;
        return isPrime(input, divisor - 1);
    }

    public static void main (String [] args) {
        System.out.println(isPrime(4, 3));
        System.out.println(isPrime(7,6));
        System.out.println(isPrime(57, 56));
    }
}
