package Exercises.positiveIntegers;

// Write a program which reads a sequence of positive integers. The program stops when the user fills a negative value and shows the maximum and the minimum of these numbers.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int max = n;
        int min = n;

        if (n >= 0) {
            while (true) {
                n = s.nextInt();

                if (n < 0)
                    break;

                max = Math.max(n, max);
                min = Math.min(n, min);
//                max = n > max ? n : max;
//                max = n < min ? n : min;

//                if (n > max)
//                    max = n;
//
//                if (n < min)
//                    min = n;
            }
            System.out.println("min= " + min + ", max= " + max);
        } else {
            System.out.println(n + " is invalid");
        }
    }
}

























