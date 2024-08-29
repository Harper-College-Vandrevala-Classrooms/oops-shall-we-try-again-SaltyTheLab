package com.csc;

import java.util.Scanner;

public class Menu {
    Scanner input = new Scanner(System.in);

    public String number(int number) {
        // input loop for invalid numbers
        while (number < 1) {
            System.out.print("number too small, enter a number: ");
            number = input.nextInt();
        }
        input.close();
        return String.format("Your number is %d.", number);
    }

    // driver
    public static void main(String[] args) {
        Menu james = new Menu();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int number = input.nextInt();
        System.out.print(james.number(number));
    }
}
