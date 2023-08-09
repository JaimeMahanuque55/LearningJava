package Exercises.AddRemoveDisplayExitElements;

// Create a menu program with the following options:
// 1. Add Element
// 2. Remove Element
// 3. Display Elements
// 4. Exit

// This program runs infinitely until the user chooses the fourth option.

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        while (true) {
            displayMenu();
            int choice = input.nextInt();

            if (choice == 1) {
                // ADD
                System.out.print("Enter an integer: ");
                integers.add(input.nextInt());
                System.out.println("Added");
            } else if (choice == 2) {
                // Remove
                System.out.print("Enter a number to remove: ");
                int elementToRemove = input.nextInt();
                if (integers.contains(elementToRemove)) {
                    integers.remove(Integer.valueOf(elementToRemove));
                    System.out.println("Removed.");
                } else
                    System.out.println("Element not found.");
            } else if (choice == 3) {
                System.out.println("Your List: " + integers);
            } else if (choice == 4) {
                System.out.println("Good bye");
                break;
            } else
                System.out.println("Invalid option.");
        }
    }

    private static void displayMenu() {
        System.out.println();
        System.out.println("1. Add");
        System.out.println("2. Remove");
        System.out.println("3. Display");
        System.out.println("4. Exit");
        System.out.println();
        System.out.print("Your Choice: ");
    }
}
