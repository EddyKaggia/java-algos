package numbers;

public class GCD {
    public static int gcd(int num1, int num2) {
        if (num2 == 0) return num1;
        return gcd(num2, num1 % num2);
    }

    public static void main(String [] args) {
        System.out.println(gcd(3, 7));
        System.out.println(gcd(4, 9));
        System.out.println(gcd(9, 18));
    }
}
