package org.example;

public class FinallyBlock {

    public static void main(String[] args) {


        int arr[] = new int[2];
        try {
            System.out.println("Access third element: " + arr[0]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown : " + e.getMessage());
//            e.printStackTrace();
        } finally {
            System.out.println("Finally Block");
        }


    }
}




