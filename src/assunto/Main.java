//package assunto;
/*
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello from the first time");
        james.sayHi();
    }
}
*/

// Command Line Arguments in Java
//public class Main {
//    public static void main(String[] args) {
//        System.out.println(args[0]);
//        System.out.println(args[1]);
//        System.out.println(args[2]);
//    }
//}

// Variables in Java - Practice

//public class Main {
//    public static void main(String[] args) {
//        String myName = "Man";
//        String myJob = "Programmer";
//        String myNameCopy = myName;
//        System.out.println(myName);
//        System.out.println(myJob);
//        System.out.println(myNameCopy);
//
//    }
//}


// Constants in Java
//public class Main {
//    public static void main(String[] args) {
//        final String MY_NAME = "Jaime Mahanuque";
//        System.out.println(MY_NAME);
//    }
//}

// Integers Data Types in Java - Practice
//package assunto;
//
//public class Main {
//
//    public static void main(String[] args) {
//        byte b1 = 5;
//        short s1 = 20;
//        int i1 = 100;
//        long l1 = 99999999999999L;
//        float f1 = 4.5F;
//
//        System.out.println(b1);
//        System.out.println(s1);
//        System.out.println(i1);
//        System.out.println(l1);
//
//        String name;
//        name.
//
//        System.out.println(Float.MAX_VALUE);
//
//    }
//}

// //////////////////////////Calling String Methods in Java
//package assunto;
//
//public class Main {
//    public static void main(String[] args) {
//        String s1 = "NeSo AcaDEMy";
//
//        System.out.println(s1.toUpperCase());
//
//        String s2 = s1.toLowerCase();
//        System.out.println(s2);
//        System.out.println(s1);
//
//        System.out.println(s1.length());
//
//        String s3 = "";
//        System.out.println(s3.isEmpty());
//        System.out.println(s3.isBlank());
//
//        String s4 = "ABCA";
//        System.out.println(s4.charAt(1));
//
//        System.out.println(s4.indexOf('B'));
//
//        System.out.println(s4.lastIndexOf('A'));
//
//        System.out.println(s4.concat(" DEFG"));
//
//
//    }
//}

//////////////// Primitive Types and Reference Types in Java

// Types that hold simple values
// byte, short, int, long, float, double, and char are primitives types

// Reference Types
// Types that hold complex values (objects)
// String is a reference types


/////////////////////  Instantiating a String Object

//package assunto;
//
//public class Main {
//
//
//    public static void main(String[] args) {
//        String name1 = "Neso Academy";
//        String name2 = "Neso Academy";
//        String name3 = new String("Neso Academy");
//
//        System.out.println(name1);
//        System.out.println(name2);
//        System.out.println(name3);
//    }
//}

///////////////// Strings are immutable in Java
//// Outline
// Immutable Objects
// Strings are immutable
// Using new with Strings

/// Immutable objects
// Objects whose contents can not be changed
// - A constant is a variable whose value can not change;
// - An immutable object is an object whose content can not be changed;
// - Immutable objects are created from immutable classes;
// - The String Class in java is immutable -> The content of String objects in java can not be changed.

//package assunto;
//
//public class Main {
//    public static void main(String[] args) {
//        String str = "Old Value"; // Garbage: Will be removed from the memory by the Java Garbage collector
//        str = "New Value";
//        System.out.println(str);
//    }
//}

//// Using New with Strings
// Strings are immutable -> no need to use new
// - We would want to use new because it allows us to create a separate object that references a separate value
// - When working with String this is not needed because the original String will not be modified because Strings are immutable

///////////// The Scanner Class in Java

// outline
// - The Scanner Class
// - Instantiating a Scanner object
// - Input methods
// - Reading input from the keyboard

//package assunto;
//
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner inputName = new Scanner(System.in);
//        Scanner inputAge = new Scanner(System.in);
//        Scanner inputSchool = new Scanner(System.in);
//
//        System.out.print("What is your name: ");
//        String name = inputName.next();
//        System.out.print("How old are you?: ");
//        int age = inputAge.nextInt();
//        System.out.print("Where do you study: ");
//        String school = inputSchool.next();
//
//        System.out.println("My name is "+name+", i'm "+age+ " years old and i study at "+school);
//
//
//
//
//    }
//}

///////////////////////// Casting in Java

/// Outline
// - Casting
// - Implicit Casting
// - Explicit Casting

// - Casting = Converting a data type to another type

//// - Implicit casting = Happens automatically when converting from a narrower range data type to a wider range data type
// -> Converting an int to a double/float/long;
// -> converting a float to a double;

/// Implicit casting happens because
// - The range of a double is wider than an int;
// - The range of a double is wider than a float;
// - The range of a long is wider than an int.


//// - Explicit casting = Does not happen automatically. Should be done by the programmer when converting from a wider to narrower data type
// -> converting a double/float/long to an int
// -> converting a double to a float

//package assunto;
//
//public class Main {
//    public static void main(String[] args) {
//        int n = (int) 3.5;
//        double d1 = 4.5 + 3;
//
//        System.out.println(d1);
//    }
//}

///////////////// Conditional Operator in Java

//package assunto;
//
//public class Main {
//    public static void main(String[] args) {
//        int a = 10;
//        int b = 15;
//
//        int max = a > b ? a : b;
//
//        System.out.println(max);
//        name();
//    }
//
//    public static void name() {
//        String name = "Foi";
//
//        System.out.println(name.isEmpty() ? "The name is not valid" : name);
//    }
//}

////////////////// if Statement in Java

//package assunto;
//
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
////        int x = 5;
////        int y = 5;
////
////        if (x > y)
////            System.out.println("The maximum is " + x);
////        if (y > x)
////            System.out.println("The maximum is " + y);
////        if (y == x)
////            System.out.println("The numbers are equal");
//    }
//}


/////////////////// Switch Statement in java

//package assunto;
//
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Enter a number");
//        int n = input.nextInt();
//
//
//        switch (n) {
//            case 10:
//                System.out.println("= 10");
//            case 90:
//                System.out.println("= 90");
//            case -3:
//                System.out.println("= -3");
//            default:
//                System.out.println("non of the above");
//        }
//    }
//}

/////////////////// The Do While Loop in Java

//package assunto;
//
//public class Main {
//    public static void main(String[] args) {
//        int i = 1;
//
//        do {
//            System.out.println("Hello " + i);
//            i++;
//        } while (i <= 3);
//    }
//}

/////////////// The For Loop in Java
//package assunto;
//public class Main {
//    public static void main(String[] args) {
//        for (int i = 1; i <= 5; i++) {
//            System.out.println("Hello "+ i);
//        }
//    }
//}


////////////// Nested Loops in Java

//package assunto;
//
//public class Main {
//    public static void main(String[] args) {
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 2; j++)
//                System.out.println(i + " " + j);
//        }
//        System.out.println();
//    }
//}
//package assunto;
//
//public class Main {
//    public static void main(String[] args) {
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= i; j++)
//                System.out.print("*");
//            System.out.println();
//        }
//    }
//}

////////////////// Break and Continue Keywords in Java

// Special Keywords that can be used within loops

//// break: Exits the loop regardless of the condition.

//// continue: skips the rest of the loop's body. Continue executing the loop as if we finished executing the body.


//package assunto;
//
//public class Main {
//    public static void main(String[] args) {
//        for (int i = 1; i <=10; i++) {
//            if (i % 2 == 0)
//                continue;
//            System.out.println(i + " ");
//        }
//    }
//}

//package assunto;
//
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//
//        int n;
//
//        while(true) {
//            System.out.print("Enter a number between 1 and 10: ");
//            n = s.nextInt();
//
//            if (n < 1 || n > 10)
//                continue;
//
//            break;
//        }
//        System.out.println(n + " is between 1 and 10");
//    }
//}

/////////////////////////// Methods in Java
///////// Outline
// Void method
// Value-returning method
// The return keyword
// calling methods

///// Void method
// A method that does not return a value. The return type is void.

///// Value-returning method
// A method that returns a value. The return type is the type of the data that will be returned.

//// The return keyword
// A keyword that can be used to return a value from a method

///////////////////////// Passing Arguments by value in Java
//////// Outline
// Parameters & Arguments
// Passing Arguments by value

/////////////////////// Passing Arguments by Reference in java
///////////// Outline
// Point Class in Java
// Passing Arguments by Reference

//package assunto;
//
//import java.awt.*;
//
//public class Main {
//    public static void main(String[] args) {
//        Point p1 = new Point();
//        p1.x = 1;
//        p1.y = 2;
//        System.out.println("x= " + p1.x + ", y= " + p1.y);
//
//        change(p1);
//        System.out.println("x= " + p1.x + ", y= " + p1.y);
//    }
//
//    private static void change(Point p) {
//        p.x = 2;
//        p.y = 1;
//    }
//}


////////////////// Methods Overloading in java
//// Outline
// Method Overloading
// Overloading some methods

// Method Overloading is writing the same method with diferent parameters

//package assunto;
//
//public class Main {
//    public static void main(String[] args) {
//        System.out.println(sum(2, 3));
//        System.out.println(sum(2, 3, 2));
//    }
//
//    public static int sum(int x, int y) {
//        return x + y;
//    }
//
//    public static int sum(int x, int y, int z) {
//        return x + y + z;
//    }
//}

// Note: Overloaded methods can have different return types
// Note: Overloaded methods must have different parameters


////////////////// Single-Dimensional Arrays in Java (Part 1)
///// Outline
// The null value
// Arrays in java
// Creating arrays and default values
// Accessing arrays elements
// Arrays initializers
// Printing arrays

// NULL -> The value of an object that references nothing

///// Arrays -> A collection of variables of the same data type
// An Arrays in java is an object;
// An array variable references a group of data;
// The size of an array is fixed.

///// Default Values -> When an array is created, its elements are assigned the following default values:
// 0 for the numeric primitive data types;
// \u0000 for char types;
// false for boolean types;
// null for reference types.

///// Accessing Array elements
// Use brackets and indices
// int[] numbers = new int[5]; {0, 0, 0, 0, 0}
// Accessing the first element -> numbers[0] = 5; {5, 0, 0, 0, 0}
// Accessing the third element -> numbers[2] = 10; {5, 0, 10, 0, 0}
// Accessing the last element -> numbers[4] = 3; {5, 0, 10, 0, 3}

// Printing arrays
//package assunto;
//
//public class Main {
//    public static void main(String[] args) {
//        int[] numbers = {5, 3, 2, 0, 10};
//
//        System.out.println(numbers); // Prints the address
//
////        for (int number : numbers) System.out.print(number + " ");
//        for (int i = 0; i < numbers.length; i++)
//            System.out.print(numbers[i] + " ");
//    }
//}


////////////////// Single-Dimensional Arrays in Java (Part 2)
///// Outline
// Anonymous arrays
// Exceeding Array bounds
// Printing char arrays
// Passing arrays to methods
// Returning arrays from methods

// Anonymous arrays ->  An arrays without a variable referencing it.

//new Scanner(System.in).nextDouble();
//new int[] {1, 2, 3, 4};
//printArray(new int[] {1, 2, 3, 4}):

//Exceeding Array bounds -> The indices must be between 0 and length - 1

// char[] chars = {'a', 'b', 'c', 'd'};
// Index -1 out of bounds for length 4
// System.out.println(chars[-1]);

// Index 4 out of bounds for length 4
// System.out.println(chars[4]);

// System.out.println(chars); // abcd

// ArrayIndexOutOfBoundsException -> Think on this message like an error.


// Passing arrays to methods -> Arrays are passed by reference, because arrays are objects

// example:
//package assunto;
//
//public class Main {
//    public static void main(String[] args) {
//        int[] numbers = {0, 1};
//        change(numbers);
//        printArray(numbers);
//
//    }
//
//    public static void change(int[] numbers) {
//        numbers[0] = 1; // {1, 1}
//        numbers[1] = 0; // {1, 0}
//    }
//
//    public static void printArray(int[] numbers) {
//        for (int i = 0; i < numbers.length; i++)
//            System.out.print(numbers[i] + " ");
//    }
//}

/////////////////// The Arrays Class in Java (Part 1)
///// Outline
// The Arrays class
// Sorting arrays
// Searching arrays

//////// Arrays class -> A class that contains some static methods that are used with arrays
// - Sorting, searching, comparing, Filling and Returning a string representation of an array

// Sorting arrays -> sort(array): sorts the whole array
///////////////// -> sort(array, fromIndex, toIndex): sort from (fromIndex) to (toIndex - 1)

// Searching Arrays:
///// Using binarySearch()
// - The array should be sorted in increasing order
// - binarySearch(array, element) -> binarySearch(numbers, 4)

///// Return values:
// - Index of element inside the array if exists
// -  -(insertionIndex + 1) if the element was not found

//example:
//package assunto;
//
//import java.util.Arrays;
//
//public class Main {
//    public static void main(String[] args) {
//        int[] numbers = {5, 4, 3, 2, 1, 0, -1};
//        Arrays.sort(numbers);
//
//        System.out.println(Arrays.toString(numbers));
//        System.out.println( Arrays.binarySearch(numbers, 4));
//        System.out.println( Arrays.binarySearch(numbers, 3));
//        System.out.println( Arrays.binarySearch(numbers, -3));
//        System.out.println( Arrays.binarySearch(numbers, 6));
//
//        String[] strings = {"a", "b", "c"};
//        System.out.println( Arrays.binarySearch(strings, "a"));
//        System.out.println( Arrays.binarySearch(strings, "c"));
//        System.out.println( Arrays.binarySearch(strings, "A"));
//        System.out.println( Arrays.binarySearch(strings, "d"));
//    }
//
//    // If you try to use with array of Points you will get an exception
//}

//////////////////// The Arrays Class in Java (Part 2)
///// Outline
// Comparing Arrays
// The equals method

// Comparing arrays -> Using equals
//example

//package assunto;
//
//import java.util.Arrays;
//
//public class Main {
//    public static void main(String[] args) {
//
//        int[] numbers1 = {5, 4, 3, 2, 1, 0, -1};
//        int[] numbers2 = {5, 4, 3, 2, 1, 0, -1};
//        int[] numbers3 = {5, 4, 7, 2, 1, 0, -1};
//
//        System.out.println(numbers1 == numbers2); // False, because it's comparing the arrays address.
//        System.out.println(Arrays.equals(numbers1, numbers2)); // True
//        System.out.println(Arrays.equals(numbers1, numbers3)); // false
//    }
//}


/// The equals method

//package assunto;
//
//import java.util.Arrays;
//
//public class Main {
//    public static void main(String[] args) {
//        String str1 = new String("Hello");
//        String str2 = new String("Hello");
//
//        System.out.println( str1 == str2); // false
//        System.out.println( str1.equals(str2)); // true
//    }
//}


//////////////////// The Arrays Class in Java (Part 3)
///// Outline
// Filling arrays
// Printing arrays

// Filling arrays -> Using fill()

// fill(Array, value): fill whole array
//int[] numbers1 = new int[5]; // {0, 0, 0, 0, 0, 0}
//Arrays.fill(numbers1, 3); // {3, 3, 3, 3, 3, 3}
// example
//package assunto;
//
//import java.awt.*;
//import java.util.Arrays;
//
//public class Main {
//    public static void main(String[] args) {
//        int[] numbers1 = new int[8];
//        Arrays.fill(numbers1, 3);
//        System.out.println(Arrays.toString(numbers1));
//
//        int[] numbers2 = new int[8];
//        Arrays.fill(numbers2, 3, 7, 55);
//        System.out.println(Arrays.toString(numbers2));
//
//        // filling objects
//
//        String[] strings = new String[3];
//        Arrays.fill(strings, "Hello");
//        System.out.println(Arrays.toString(strings));
//
//        // filling points
//        Point[] points = new Point[3];
//        Arrays.fill(points, 0, 2, new Point(1, 2));
//        System.out.println(Arrays.toString(points));
//    }
//}

// Printing Array -> We use toString() to print strings

//////////////////////////// Variable-Length Argument Lists in Java
///// Outline
// Passing a variable number of arguments to a method

// A variable number of arguments can be passed to a method.

//example
//package assunto;
//
//public class Main {
//    public static void main(String[] args) {
//
//    }
//    public static int sum(int... numbers) {
//        int sum = 0;
//        for (int i = 0; i < numbers.length; i++)
//            sum += numbers[i];
//
//        return sum;
//    }
//}

// VARIABLE-LENGTH ARGUMENT LISTS
// - Only one variable-length parameter may be specified in a method;
// - It must be the last parameter;
// - Any other parameters must proceed it;
// - We can pass an array or a variable number of arguments to a variable-length parameter;
// - When invoking a method with a variable number of arguments, Java creates an array and passes the arguments to it.


//example:

//package assunto;
//
//import static java.lang.Integer.sum;
//
//public class Main {
//    public static void main(String[] args) {
//        System.out.println( sum(1, 7, -2));
//
//        int[] numbers = {1, 7, -2};
//        System.out.println( sum(numbers));
//
//        System.out.println( sum(new int[] {1, 9, -2}));
//    }
//
//    public static int sum(int... numbers) {
//        int sum = 0;
//        for (int i = 0; i < numbers.length; i++)
//            sum += numbers[i];
//
//        return sum;
//    }
//
//}





















































