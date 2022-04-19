package com.codealex;

public class Exception1 {
    public static void main(String[ ] args) {
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);// element with index 10 does not exist
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }
}
