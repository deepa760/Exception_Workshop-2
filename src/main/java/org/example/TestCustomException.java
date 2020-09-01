package org.example;


import exception.MyUserIdException;

import java.util.Scanner;


public class TestCustomException {

    public static void testInput() throws MyUserIdException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter a userId: ");
        String input = scanner.next();
        try {
            int n = Integer.parseInt(input);
            if (n == 0) {
                throw new MyUserIdException("invalid");
            }

        } catch (RuntimeException e) {
            System.out.println("Invalid input param - try to input a valid number");
        }

    }

    public static void main(String[] args) {
        try {
            testInput();
        } catch (MyUserIdException e) {
            e.printStackTrace();
        }
    }
}