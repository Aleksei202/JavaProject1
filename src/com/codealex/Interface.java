package com.codealex;

// Interface
interface Animal3 {
    public void animalSound(); // interface method (does not have a body)
    public void sleep(); // interface method (does not have a body)
}

// Pig "implements" the Animal interface
class Pig3 implements Animal3 {
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
    }
    public void sleep() {
        // The body of sleep() is provided here
        System.out.println("Zzz");
    }
}

class Interface {
    public static void main(String[] args) {
        Pig3 myPig = new Pig3();  // Create a Pig object
        myPig.animalSound();
        myPig.sleep();
    }
}
