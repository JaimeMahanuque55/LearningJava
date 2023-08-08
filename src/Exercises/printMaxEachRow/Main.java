package Exercises.printMaxEachRow;

// Write a program that prints the maximum of each row in 2D array.
public class Main{
    public static void main(String[] args) {
        int[][] integers = {
                {1, 10, 3, 8},
                {9, 12, 6, 7},
                {5, 2, 100, 4}
        };

        for (int i = 0; i < 3; i++)
            System.out.println("Row " + (i + 1) + ": " + getMax(integers[i]));

//        for (int i = 0; i < 3; i++) {
//            int max = integers[i][0];
//            for (int j = 1; j < 4; j++ ) {
////                max = (integers[i][j] > max) ? integers[i][j] : max;
//                max = Math.max(integers[i][j], max);
//            }
//
//        }
    }
    private static int getMax(int[] integers) {
        int max = integers[0];
        for (int i = 0; i < integers.length; i++) {
            max = (Math.max(max, integers[i]));
        }
        return max;
    }


}
