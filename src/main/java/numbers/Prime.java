package numbers;

public class Prime {
    public static Boolean isPrime(int input) {
        boolean prime = true;

        if (input <= 1) 
            prime = false;

        for (int i = 2; i < input; i++) {
            if (input % i == 0) {
                prime = false;
                break;
            }
        }

            return prime;
    }

    public static void main(String [] args) {
        System.out.println(isPrime(5));
        System.out.println(isPrime(4));
        System.out.println(isPrime(13));
    }
}
