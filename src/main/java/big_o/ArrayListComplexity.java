package big_o;
import java.util.*;

public class ArrayListComplexity {

    public static void complexity() {
        ArrayList<Integer> myList = new ArrayList<>();

        // O(1)
        myList.add(11);
        myList.add(3);
        myList.add(23);
        myList.add(7);
        myList.remove(3);

        // O(n)
        myList.remove(0);
        myList.add(0, 11);

        // Find item by value -> O(n)
        // Find item by index -> O(1)
    }
   
}
