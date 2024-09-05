package com.csc;

import java.util.Scanner;

public class Menu {
    Scanner input = new Scanner(System.in);

    public String number(int number, int upperbound, int lowerbound) {
        // input loop for invalid numbers
        if (upperbound == 0 && lowerbound == 0)
            return String.format("your number is %d", number);
        // loop input for upper and lower bounds
        while (number < lowerbound || number > upperbound) {
            // if only the lower bound is set
            if (upperbound == 0) {
                while (number < lowerbound) {
                    System.out.print("number too small, enter a number: ");
                    number = input.nextInt();
                }
                return String.format("your number is %d", number);
            }
            // if only the upper bound is set
            if (lowerbound == 0) {
                while (number > upperbound) {
                    System.out.print("number too large, enter a number: ");
                    number = input.nextInt();

                }
                return String.format("your number is %d", number);
            }
            // otherwise check both
            while (number < lowerbound) {
                System.out.print("number too small, enter a number: ");
                number = input.nextInt();
            }
            while (number > upperbound) {
                System.out.print("number too large, enter a number: ");
                number = input.nextInt();
            }

        }
        return String.format("your number is %d", number);

    }

    public String number(String text) {
        Menu menu = new Menu();
        // checking for default, exit or any characters besides those words
        // have been entered
        // prompt for user input
        if (text.contains("exit"))
            System.exit(0);
        if (text.isEmpty() == false && text.contains("default") == false) {
            System.out.print("invalid response, closing program.");
            System.exit(0);
        }
        if (text.contains("default"))
            return String.format("Your number is %d.", 100);
        System.out.print("enter your upper bound(enter 0 for no upper bound): ");
        int upperbound = input.nextInt();
        System.out.print("enter your lower bound(enter 0 for no lower bound): ");
        int lowerbound = input.nextInt();
        System.out.print("Enter your value: ");
        int num = input.nextInt();
        return (menu.number(num, upperbound, lowerbound));
    }

    // driver
    public static void main(String[] args) {
        Menu james = new Menu();
        Scanner input = new Scanner(System.in);
        System.out.print("Press Enter to enter a value or type default for 100.\n");
        System.out.print("Type exit to leave the program.\n");
        String text = input.nextLine();
        System.out.print(james.number(text));
    }
}
