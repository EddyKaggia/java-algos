package numbers;

public class TriangularNumber {
    public static int triangle(int n) {
        return n * (n + 1) /2;
    }

    public static void main(String[] args) {
System.out.println(triangle(5));
System.out.println(triangle(6));
System.out.println(triangle(7));
    }
}
