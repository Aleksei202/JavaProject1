package com.codealex;

public class Recursion {
    public static void main(String[] args) {
        int result = sum(9);
        System.out.println("Result of summ " + result);
    }
    public static int sum(int k) {
        if (k > 0) {
            System.out.println(k);
            return k + sum(k - 1);

        } else {
            return 0;
        }
    }
}
