package com.eddykaggia.arrays;

public class ReplaceLast {

    public static String replace(String inputStr, String replacementStr) {
    // Find space
    char[] inputArr = inputStr.toCharArray();
    String newStr = "";
    int i = 0;
    int indexSpace = -1;

    while (i < inputArr.length) {
        if(inputArr[i] == ' ') {
            indexSpace = i;
            break;
        }
        i++;
    }

    // Copy first part of input string to output string
    int j = 0;

    while (j < indexSpace) {
        newStr += inputArr[j];
        j++;
    }

    // Add space to string
    newStr += ' ';
    // Add string to end
    newStr += replacementStr;

    return newStr;
    }


    public static void main(String[] args) {
        System.out.println(replace("Inside Up?", "Out!"));
        System.out.println(replace("Pulp Reality", "Fiction"));
        System.out.println(replace("Bene Sedai", "Gesserit"));
    }
}
