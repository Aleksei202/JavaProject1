package com.codealex;

import java.util.Scanner;

class Scanner1 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter username");

        String userName = myObj.nextLine();
        myObj.close();
        System.out.println("Username is: " + userName);
    }
}
