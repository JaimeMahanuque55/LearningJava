package Exercises.sumRow2DArray;

public class Main {
    public static void main(String[] args) {
        int[][] integers = {
                {1, 2, 3, 4},
                {5, 6, 7, 8, 9},
                {9, 10, 11, 12}
        };

        int sum = 0;
        for (int i = 0; i < integers.length; i++) {
            sum = 0;
            for (int j = 0; j < integers[i].length; j++) {
                sum += integers[i][j];
            }

            System.out.println("The sum of row " + (i + 1) + ": " + sum);
        }
    }
}
