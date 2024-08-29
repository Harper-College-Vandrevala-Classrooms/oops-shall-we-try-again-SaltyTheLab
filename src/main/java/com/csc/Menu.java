package com.csc;

import java.util.Scanner;

public class Menu {
    Scanner input = new Scanner(System.in);

    public String number() {
        int number;
        // user input
        System.out.print("Enter your number:");
        number = input.nextInt();
        // input loop for invalid numbers
        while (number < 1) {
            System.out.println("number too small, enter a number:");
            number = input.nextInt();
        }
        return String.format("Your number is %d.", number);
    }

    // driver
    public static void main(String[] args) {
        Menu james = new Menu();
        System.out.print(james.number());
    }
}
