package com.codealex;

import java.util.Scanner;

class Scanner2 {
    public static void main(String[] args) {
        //create an instance for input
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter name, age and salary:");

        // String input , attribute get a value when you press ENTER
        String name = myObj.nextLine();

        // INT Numerical input, attribute get a value when you press ENTER
        int age = myObj.nextInt();
        // FLOAT Numerical input, attribute get a value when you press ENTER
        double salary = myObj.nextDouble();
        myObj.close();

        // Output input by user, attribute get a value when you press ENTER
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}
