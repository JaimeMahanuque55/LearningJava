package Exercises.getNameAndAge;

// Write a method that gets the name of the user and a method that gets the age of user

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Write you name: ");
        System.out.println(getName());
        System.out.print("Write your age: ");
        System.out.println(getAge());
    }
    public static String getName() {
        Scanner s = new Scanner(System.in);
        return s.nextLine();
    }

    public static int getAge() {

        return new Scanner(System.in).nextInt();
    }
}
