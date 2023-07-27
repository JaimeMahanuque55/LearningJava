package Exercises.readsaninteger;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//
//        System.out.print("Enter a number between 1 and 10: ");
//        int n = s.nextInt();
//
//
//        while (n < 1 || n > 10) {
//            System.out.print(n + " is not between 1 and 10. Try again: ");
//            n = s.nextInt();
//        }
//
//        System.out.println(n + " is between 1 and Ten");
        doWhile();
    }

    public static void doWhile() {
        Scanner s = new Scanner(System.in);
        int n;

        do {
            System.out.print("Enter a number between 1 and 10: ");
            n = s.nextInt();
        } while (n < 1 || n > 10);

        System.out.println(n + " is between 1 and 10");
    }
}











