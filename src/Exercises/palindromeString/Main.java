package Exercises.palindromeString;

// Write a program which finds if a string is a palindrome string or not.
//A palindrome string is read the same starting from start or the end.

public class Main {
    public static void main(String[] args) {
        String str = "noon";

//        int j = str.length() - 1;
//        for (int i = 0; i < j; i++) {
//
//            j--;
//        }

        boolean isPalindrome = true;
        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            if (str.charAt(i) == str.charAt(j))
                continue;

            isPalindrome = false;
            break;
        }

        System.out.println(isPalindrome ? "is palindrome" : "is not palindrome");

    }
}
