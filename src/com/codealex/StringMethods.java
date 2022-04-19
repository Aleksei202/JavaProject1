package com.codealex;

public class StringMethods {
    public static void main(String[] args){
        String text1 = "12345 6789 ABVGD abvgd";
        String myStr1 = "Hello";
        String myStr2 = "Hello";


        System.out.println("Symbol number 4 is "+text1.charAt(4));// print symbol with index 4 (start from 0)

        System.out.println("lenth of text is " + text1.length());

        System.out.println(myStr1.compareTo(myStr2)); // Returns quantity of differences
        // but works werd if has crossed notmaches like Hello1 and HelloS

        System.out.println(text1.concat(myStr1));// add o string to end of other string

        char[] myStr3 = {'H', 'e', 'l', 'l', 'o'};
        String myStr4 = "";
        myStr4 = myStr4.copyValueOf(myStr3, 0, 5);
        System.out.println("Returned String: " + myStr4);//array to string
        System.out.println("myStr3 is still array of Char: "+myStr3);//myStr3 is not converted to string


        System.out.println(myStr1.equals(myStr2)); // Returns true because they are equal. Comparaton of string
        System.out.println(myStr1.equals(text1)); // false

        System.out.println(myStr1.replace('l', 'p'));// characters replace ,
        System.out.println(myStr1);        // it does not changed parent class string.
        String myStrObject1 = myStr1.replace('l', 'O');
        System.out.println("New string object =" + myStrObject1);//new class has changed characters


        String txt = "Hello World";

        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());
        System.out.println(txt);// out Hello World because method created new instances,
        // instance txt rests the same
        txt = txt.toUpperCase();
        System.out.println(txt);// out HELLO WORLD because txt is changed


        String myStr = "       Hello World!       ";
        System.out.println(myStr);
        System.out.println(myStr.trim());//remove spaces before and after text




    }
}
