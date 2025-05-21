package numbers;

public class BallHeight {
    public static int ball(double ball) {
        int count = 0;

        while (ball >= 1) {
            ball /= 2;
            count++;
        }

        return count;
    }

    public static void main (String [] args) {
        System.out.println(ball(10));
        System.out.println(ball(987));
        System.out.println(ball(1000999));
        System.out.println(ball(100099900));
    }
}
