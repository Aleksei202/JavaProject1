package com.codealex;

public class Wrapper1 {
    public static void main(String[] args) {
        Integer myInt = 5;
        Integer myInt2 = 100;// Ithink yellow warning that you use string method to int object
        Double myDouble = 5.99;
        Character myChar = 'A';

        System.out.println(myInt);
        System.out.println(myDouble);
        System.out.println(myChar);

        // same result , but using method ._value
        System.out.println(myInt.intValue());
        System.out.println(myDouble.doubleValue());
        System.out.println(myChar.charValue());

        // transfer integer object to string object
        String myString = myInt2.toString();
        System.out.println(myString.length());
    }
}
