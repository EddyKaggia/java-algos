package strings;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {
    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> inputList) {
        ArrayList<Integer> output = new ArrayList<>();

        for (int i = 0; i < inputList.size(); i++) {
            int current = inputList.get(i);
            boolean isDuplicate = false;

            for (int j = 0; j <output.size(); j++) {
                if (output.get(j) == current) {
                    isDuplicate = true;
                    break;
                }
            }

            if(!isDuplicate) {
                output.add(current);
            }
        }
        return output;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>() {{
            add(1);
            add(3);
            add(2);
            add(3);
            add(4);
            add(1);
        }};
        
        System.out.println(removeDuplicates(list));
    }
}
