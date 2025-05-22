package miscellaneous;

import java.util.HashMap;

public class Pointers {

    public static void main(String[] args) {
        //With primitives only the value is passed to new variables
        int num1 = 11;
        int num2 = num1;

//        System.out.println(num2); // Should be 11

        num2 += 67;

//        System.out.println(num2);
//        System.out.println(num1);


        // With objects = assignment operator makes both variables point to the same object in memory
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();


        map1.put("value", 11);
        map2 = map1;
        map1.put("value", 22);

        System.out.println(map1);
        System.out.println(map2);

    }
}
