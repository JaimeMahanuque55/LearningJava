package Exercises.primeNumber;

import java.util.Scanner;

public class Main {
//    solution 1
//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//
//        System.out.print("Enter a number: ");
//        int n = s.nextInt();
//
//        int sum = 1;
//        for (int i = 2; i <= n/2; i++)
//            if (n % i == 0)
//                sum += i;
//
//        System.out.println(sum == 1 ? "Prime" : "not prime");
//
//    }

//    solution 2
public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int n = s.nextInt();

    boolean isPrime = true;
    for (int i = 2; i <= n/2; i++ )
        if (n % i == 0) {
            isPrime = false;
            break;
        }
    System.out.println(isPrime ? "Prime" : "not prime");
}
}
