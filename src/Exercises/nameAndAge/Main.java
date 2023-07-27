package Exercises.nameAndAge;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name and age: ");
        String name = input.nextLine();
        int age = input.nextInt();
        System.out.println(name + "! You are " + age + " years old!");
    }
}
