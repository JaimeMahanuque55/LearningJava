package Exercises.rectangleClassDiagram;

// Create an array of 3 Rectangles read from the keyboard, then print the attributes of each Rectangle.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[3];

        Scanner input = new Scanner(System.in);
        for (int i = 0; i < rectangles.length; i++) {
            System.out.println("Do you want to enter the width and the height? (y/n)");

            char choice = input.next().charAt(0); // y/n
            if (choice == 'y') {
                rectangles[i] = new Rectangle(input.nextDouble(), input.nextDouble());
            }
            else {
                rectangles[i] = new Rectangle();
            }
//            else if (choice == 'n') {
//                rectangles[i] = new Rectangle();
//            } else {
//                System.out.println("Invalid");
//                rectangles[i] = new Rectangle();
//            }
        }

        System.out.println("The rectangles are:");
        for (int i = 0; i < rectangles.length; i++)
            System.out.println("Rectangle " + (i+1) +
                    ": width: " + rectangles[i].getWidth() +
                    ", height: " + rectangles[i].getHeight() +
                    ", perimeter: " + rectangles[i].getPerimeter() +
                    ", area: " + rectangles[i].getArea()
            );
    }
}



























