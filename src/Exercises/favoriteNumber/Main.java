package Exercises.favoriteNumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputFavNumber = new Scanner(System.in);

        System.out.print("Enter Your Favorite Integer: ");
        int favNumber = inputFavNumber.nextInt();
        System.out.println(favNumber + " is my favorite integer too!");
    }
}
