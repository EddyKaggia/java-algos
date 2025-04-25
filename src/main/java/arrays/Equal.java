package arrays;

public class Equal {
    public static Boolean same(Object[] arr1, Object[] arr2) {
     if (arr1.length != arr2.length) {
        return false;
     }

     int i = 0;

     while (i < arr1.length) {
        if (arr1[i] != arr2[i]) {
            return false;
        }
        i++;
     }

     return true;
    }

    public static void main(String [] args) {
        Object [] input1 = {1,2,3,4,8,9};
        Object [] input2 = {1,2,3,4,8,9};
        Object [] input3 = {1,3,5,7,9};
        Object [] input4 = {2,4,6,8};
        Object [] input5 = {"hello", 'b'};
        Object [] input6 = {"hello", 'b'};

        System.out.println(same(input1, input2)); // true
        System.out.println(same(input3, input4)); // false
        System.out.println(same(input5, input6)); // true
    }
}
