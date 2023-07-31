package Exercises.reverseString;

public class Main {
    public static void main(String[] args) {
        String str = "Some Text";

        for (int i = str.length() - 1; i >= 0; i--)
            System.out.print(str.charAt(i));

        reverseSpace();
    }

    public static void reverseSpace() {
        String str = "Some Text";
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--)
            reverse += str.charAt(i);

        System.out.println(reverse);
    }
}
