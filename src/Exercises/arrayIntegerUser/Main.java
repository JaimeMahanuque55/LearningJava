//package Exercises.arrayIntegerUser;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//// Write a program that fills an array with n integers entered by the user.
//public class Main {
//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//
//        System.out.print("How many elements? (Max is 20): ");
//        int n = s.nextInt();
//
//        while (n > 20 || n <= 0) {
//            System.out.print("Invalid number, try again: ");
//            n = s.nextInt();
//        }
//
//        int[] numbers = new int[n];
//        fillArrayOfIntegers(numbers);
//        printArrayOfIntegers(numbers);
//    }
//
//    public static void fillArrayOfIntegers(int[] numbers) {
//        Scanner s = new Scanner(System.in);
//
//        for (int i = 0; i < numbers.length; i++) {
//            numbers[i] = s.nextInt();
//        }
//    }
//
//    public static void printArrayOfIntegers(int[] numbers) {
//        System.out.print("The elements are: ");
//        System.out.print(Arrays.toString(numbers));
//    }
//}

///////// Array of points

package Exercises.arrayIntegerUser;

import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("How many elements? (Max is 20): ");
        int n = s.nextInt();

        while (n > 20 || n <= 0) {
            System.out.print("Invalid number, try again: ");
            n = s.nextInt();
        }

        Point[] points = new Point[n];
        fillArrayOfPoints(points);
        printArrayOfPoints(points);
    }

    public static void fillArrayOfPoints(Point[] points) {
        Scanner s = new Scanner(System.in);


        for (int i = 0; i < points.length; i++) {
            System.out.print("Enter x and y for point " + (i + 1) + ": ");
            points[i] = new Point(s.nextInt(), s.nextInt());
        }
    }

    public static void printArrayOfPoints(Point[] points) {
        System.out.println("The elements are: ");
        for (int i = 0; i < points.length; i++) {
            System.out.println("(" + points[i].x + ", " + points[i].y + ")");
        }
    }
}











