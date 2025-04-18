package strings;

public class ReplaceLast {

    public static String replace(String inputStr, String replacementStr) {
        // Find space
        char[] inputArr = inputStr.toCharArray();
        String newStr = "";
        int i = 0;
        int indexOfSpace = -1;

        while (i < inputArr.length) {
            if (inputArr[i] == ' ') {
                indexOfSpace = i;
                break;
            }
            i++;
        }

        // Add first part of input str to output str
       int  j = 0;
        while (j < indexOfSpace) {
            newStr += inputArr[j];
            j++;
        }

        // Add space
        newStr += ' ';

        // Add replacement str
        newStr += replacementStr;
        return newStr;
    }


    public static void main(String[] args) {
        System.out.println(replace("Inside Up?", "Out!"));
        System.out.println(replace("Pulp Reality", "Fiction"));
        System.out.println(replace("Bene Sedai", "Gesserit"));
    }
}
