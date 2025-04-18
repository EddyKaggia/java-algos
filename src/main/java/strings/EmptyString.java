package strings;

public class EmptyString {
    public static Boolean isEmpty(String inputString) {
        if(inputString == "") {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isEmpty(""));
        System.out.println(isEmpty(" "));
        System.out.println(isEmpty("a"));
    }
}
