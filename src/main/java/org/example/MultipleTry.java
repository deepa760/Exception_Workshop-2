package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MultipleTry {

    public static void main(String[] args) {

        /*File file=new File("test.txt");
        try {
            FileReader reader=new FileReader(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }*/

    /*    File file=new File("test.txt");
        try {
            FileReader reader=new FileReader(file);
        } catch (RuntimeException | FileNotFoundException e) {
            e.printStackTrace();
        } */

        try {
            String[] test = {"a", "b", "c"};
            System.out.println(test[10]);
            int num = Integer.parseInt(test[0]);
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e ) {
            System.out.println(e.getMessage());
        }
    }
}