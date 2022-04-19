package com.codealex;

import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.FileWriter;
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class CreateFile1 {
    public static void main(String[] args) {
        // create empty file
        try {
            File myObj = new File("C:\\Users\\Aleksei ThinkPad\\Downloads\\filename.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();

            //write text to file
        }
        try {
            FileWriter myWriter = new FileWriter("C:\\Users\\Aleksei ThinkPad\\Downloads\\filename.txt",true);
            myWriter.append("Files in Java might be tricky, but it is fun enough!");// for overrite use .write and append:false or nothing
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        //read text from file
        try {
            File myObj = new File("C:\\Users\\Aleksei ThinkPad\\Downloads\\filename.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        File myObj = new File("filename.txt");
        if (myObj.delete()) {
            System.out.println("Deleted the file: " + myObj.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}
    //canRead()	Boolean	Tests whether the file is readable or not
    //canWrite()	Boolean	Tests whether the file is writable or not
    //createNewFile()	Boolean	Creates an empty file
    //delete()	Boolean	Deletes a file
    //exists()	Boolean	Tests whether the file exists
    //getName()	String	Returns the name of the file
    //getAbsolutePath()	String	Returns the absolute pathname of the file
    //length()	Long	Returns the size of the file in bytes
    //list()	String[]	Returns an array of the files in the directory
    //mkdir()	Boolean	Creates a directory