package Exercises.luckyNumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a four-digit number: ");
        int n = s.nextInt();

//        if (!(n > 999))
        if (!(n > 999 && n < 10000)) {
            System.out.println(n + " is not a four-digit number");
        } else {
            int fourthDigit = n % 10; // D
            int thirdDigit = (n / 10) % 10; // ABC % 10 = C
            int secondDigit = (n / 100) % 10;// AB % 10 = B
            int firstDigit = (n / 1000) % 10;// A % 10 = A

            if (firstDigit + secondDigit == thirdDigit + fourthDigit) {
                System.out.println("Lucky number");
            } else
                System.out.println("Is not a lucky number");
        }


    }
}
