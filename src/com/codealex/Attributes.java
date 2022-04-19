package com.codealex;

public class Attributes {
    int x = 5;
    static int myStatic = 45;

    public static void main(String[] args) {
        Attributes myObj1 = new Attributes();  // Object 1
        Attributes myObj2 = new Attributes();  // Object 2
        myObj2.x = 25;
        System.out.println(myObj1.x);  // Outputs 5
        System.out.println(myObj2.x);  // Outputs 25
        System.out.println(Attributes.myStatic);  //"static" modificator makes variable global and do not need to create
        //instance for getting value
    }
}
