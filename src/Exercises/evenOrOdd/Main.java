package Exercises.evenOrOdd;

import java.util.Scanner;

public class Main {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter a number: ");
//        int n = input.nextInt();
//
//        if (n % 2 == 0)
//            System.out.println("Even number");
//        else
//            System.out.println("Odd number");
//    }

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a number");
//        int n = input.nextInt();
//
//        if (n > 10) {
//            System.out.println("> 10");
//        } else if (n == 10) {
//            System.out.println("=10");
//        } else {
//            System.out.println("<10");
//        }
//    }
public static void main(String[] args) {
    Scanner S = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int n = S.nextInt();

    switch (n % 2) {
        case 0 -> System.out.println("even");
        case 1 -> System.out.println("Odd");
    }
}
}






















