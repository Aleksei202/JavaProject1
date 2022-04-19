package com.codealex;

public class Constructor {
    int modelYear;
    String modelName;

    public Constructor(int year, String name) {
        modelYear = year;
        modelName = name;
    }

    public static void main(String[] args) {
        Constructor myCar = new Constructor(1969, "Mustang");//transfer attributes 'year' and 'name' to constructor
        System.out.println(myCar.modelYear + " " + myCar.modelName);
    }
}
