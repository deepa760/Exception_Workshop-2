package org.example;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TryWithResourceExample {
   /* public static void main(String[] args) {
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        try {
            File file = new File("test.txt");
            fileReader = new FileReader(file);
            fileWriter = new FileWriter(new File("newFile.txt"));
        } catch (IOException e) {
        } finally {
            if (fileWriter !=null){
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }*/


    public static void main(String[] args) {
        File file = new File("test.txt");
        try (
                FileReader fileReader = new FileReader(file);
                FileWriter fileWriter2=new FileWriter("test123.txt");

        )  {

            System.out.println("Done");

        } catch (IOException e) {
            e.printStackTrace();
        }
        // JVN try to close first: fileWriter2 then try to close : fileReader finally try to close fileWriter
    }


}