package Exercises.spaceAfterCharacter;

// Write a program which displays a string with a space after each character.
public class Main {
    public static void main(String[] args) {
        String str = "Some text";

        for (int i = 0; i <= str.length() - 1; i++)
            System.out.print(str.charAt(i) + " ");
    }

}
