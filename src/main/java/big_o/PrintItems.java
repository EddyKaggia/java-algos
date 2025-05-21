package big_o;

public class PrintItems {
    public static void printItems(int n) {
         // O(n)
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }

        // O(n^2)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(i + " " + j);
            }
        }
    }
 
    // O(1) -> Constant time
    public static void addItems(int n) {
        System.out.println(n + n);
    }

    public static void main(String[] args) {
        printItems(10);
        addItems(4);
    }
}