package Exercises.displaysSumProductAverage;

// Write a program that displays the sum, product and average of the elements of an integer array.
public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 6, 5, 7};

        int sum = 0;
        int product = 1;
        double average;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            product *= numbers[i];
        }

        average = (double)sum / numbers.length;

        System.out.println("Sum= " + sum + ", product= " + product + ", average= " + average);
    }
}
