package strings;

public class Assignment {
    public static String nameString(String name) {
        String result = name + "Edabit";

        return result;
    }

    public static void main(String[] args) {
        System.out.println(nameString("Mubashir"));
        System.out.println(nameString("Matt"));
        System.out.println(nameString("java"));
    }
}
