package arrays;

public class Wrapper {
    public static void main(String[] args) {

        //Wrapper classes = Allow primitive values (int, char, double, boolean)
        //                 to be used as objects. "Wrap them in object"
        //                Generally, don't wrap primitives unless you need an object
        //                Allows use of Collections Framework and Static Utility Methods.

        // Autoboxing
        Integer a = 123;
        Double b = 3.14;
        Character c = '$';
        Boolean d = true;

        //Unboxing
        int x = a;

        // Test
        String y = Integer.toString(a);
        String z = Double.toString(b);

        String e = y + z;

        System.out.println(e);

    }
}
