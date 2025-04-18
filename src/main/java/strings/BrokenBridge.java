package strings;

public class BrokenBridge {
    public static Boolean isBroken(String inputString) {
            if (inputString.contains(" ")) {
                return false;
            } else {
                return true;
            }
    }

    public static void main(String[] args) {
        System.out.println(isBroken("####"));
        System.out.println(isBroken("## ####"));
        System.out.println(isBroken("#"));
        System.out.println(isBroken("### ####"));
        System.out.println(isBroken("#####"));
    }
}
