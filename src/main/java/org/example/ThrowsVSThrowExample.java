package org.example;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsVSThrowExample {

    public static void main(String[] args) {
        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            division(1,2);
        }catch (ArithmeticException e){

        }
    }


    public static void readFile() throws FileNotFoundException {
        File file = new File("test.txt");
        FileReader fileReader = new FileReader(file);
    }

    public static double division(double n1, double n2) {
        if (n2 == 0){
            throw new ArithmeticException();
        }
        return n1/n2;
    }

}