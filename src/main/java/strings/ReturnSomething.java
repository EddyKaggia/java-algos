package strings;

public class ReturnSomething {
    public static String something(String n) {
        return "something " + n;
    }

    public static void main(String[] args) {
         System.out.println(something("is better than nothing"));
         System.out.println(something("Bob Jane"));
         System.out.println(something("something"));
    }
}
