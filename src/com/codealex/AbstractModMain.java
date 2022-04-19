package com.codealex;

// abstract class
abstract class AbstractModMain {
    public String fname = "John";
    public int age = 24;
    public abstract void study(); // abstract method does not have body, body is created in inherit class-polymorphism
}

// Subclass (inherit from Main)
class Student extends AbstractModMain {
    public int graduationYear = 2018;
    public void study() { // the body of the abstract method is provided here
        System.out.println("Studying all day long");
    }// creation body of study method
}