package Exercises.calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter num1 operator num2 (3 + 2): ");
        double num1 = s.nextInt();
        char operator = s.next().charAt(0);
        double num2 = s.nextInt();
//        String operator = String.valueOf(s.next().charAt(0));

        System.out.print("The result is: " );
        if (operator == '+') {
            System.out.println((int)(num1 + num2));
        } else if (operator == '*') {
            System.out.println((int)(num1 * num2));
        } else if (operator == '-') {
            System.out.println((int)(num1 - num2));
        } else if (operator == '/'){
            System.out.println(num1 / num2);
        }
        else {
            System.out.println("Invalid operator!");
        }



    }


}
