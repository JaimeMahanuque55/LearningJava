package assunto;//package assunto;
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

///////////////// Two-Dimensional Arrays in Java (Part 1)
///// Outline
// Two-Dimensional Array
// Creating Two-Dimensional Arrays
// Accessing Ywo-Dimensional Arrays Elements
// Initializing Two-Dimensional Arrays

// Initializing 2D Arrays -> int[][] integers = {{3, 5}, {10, 2}};


///////////////// Two-Dimensional Arrays in Java (Part 2)
///// Outline
// Printing a 2D Array Row by Row
// Printing a 2D Array Column by column

// example


//package assunto;
//
//import java.util.Arrays;
//
//public class Main {
//    public static void main(String[] args) {
//        int[][] integers = { {3, 5, 7}, {10, 2, 9} };
//
//
//        // Printing using to String
//
//        System.out.println(Arrays.toString(integers));
//        // Printing using deepToSTring
//        System.out.println(Arrays.deepToString(integers));
//
//        // Printing Row by row
//
//        // Printing the first row
//        System.out.print( integers[0][0] + " ");
//        System.out.print( integers[0][1] + " ");
//        System.out.print( integers[0][2] + " ");
//
//        // Printing the second row
//        System.out.print( integers[1][0] + " ");
//        System.out.print( integers[1][1] + " ");
//        System.out.print( integers[1][2] + " ");
//
//        System.out.println();
//
//        for (int i = 0; i < 2; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print(integers[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//        // Printing column by column
//
//        System.out.print(integers[0][0] + " ");
//        System.out.print(integers[1][0] + " ");
//        System.out.print(integers[0][1] + " ");
//        System.out.print(integers[1][1] + " ");
//        System.out.print(integers[0][2] + " ");
//        System.out.print(integers[1][2] + " ");
//
//        System.out.println();
//
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 2; j++) {
//                System.out.print(integers[j][i] + " ");
//            }
//
//            System.out.println();
//        }
//
//
//    }
//
//}

///////////////////////// Two-Dimensional Arrays in Java (Part 3)
///// Outline
// Returning a 2D Array from a method
// Passing a 2D Array to a method
// Ragged Arrays


//package assunto;
//
//public class Main {
//    public static void main(String[] args) {
//        int[][] integers = getArray();
//        printArray(integers);
//    }
//
//    //Returning a 2D Array from a method
//    public static int[][] getArray() {
//        return new int[][] { {1, 2, 3, 4}, {4, 5, 6}, {7, 8, 9} };
//    }
//
//    // Passing a 2D Array to a method
////    public static void printArray(int[][] integers) {
////        for (int i = 0; i < 3; i++) {
////            for (int j = 0; j < 3; j++) {
////                System.out.print(integers[i][j]);
////            }
////            System.out.println();
////        }
////    }
//    public static void printArray(int[][] integers) {
//        for (int i = 0; i < integers.length; i++) {
//            for (int j = 0; j < integers[i].length; j++) {
//                System.out.print(integers[i][j]);
//            }
//            System.out.println();
//        }
//    }
//}

// Ragged Arrays -> A 2D array with rows of different length


///////////////////// ArrayLists in Java (Part 1)
///// Outline
// Creating an ArrayList
// Add, Access, Change, and remove an item
// Size of an ArrayList

// ArrayList -> A resizable array
// ArrayList<Integer> integers; // null
// integers = new ArrayList<>();
// ArrayList<Integer> integers = new ArrayList<>();
// ArrayList<String> fruits = new ArrayList<>();

// Note: In an ArraList, we can store objects (String, integer, Boolean, Double, character,...), not a primitive type (int, boolean, double, char...).


///// Add Items

// - Using the add() method. -> fruits.add("Apple");
// Add an element to specific index. -> fruits.add(0, "Apple");

///// Access an Item

// - Using the get() method. -> fruits.get(1);

///// Change an Item

// - Using the set() method. -> fruits.set(0, "Banana");


////// Remove an Item
//// - To remove an element, use the remove() method.
// -> Removing by index: fruits.remove(1);

// -> Removing by value: fruits.remove("Banana")

//// - To remove all elements, use the clear() method. -> fruits.clear();


///// Size
// - Using the size() method. -> fruits.size();


///////////////////// ArrayLists in Java (Part 2)
///// Outline
// Loop through an ArrayList
// Sort an ArrayList


// Loop through an ArrayList
//example
//package assunto;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;
//
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("Banana", "Apple", "Orange"));
//
//        fruits.remove("Apple");
//        fruits.add("Orion");
//        fruits.add(3, "Maca");
//        Collections.addAll(fruits, "James", "Mito", "Antr");
//
//        for (int i = 0; i < fruits.size(); i++){
////            System.out.print(fruits.get(i) + " ");
//            Collections.sort(fruits);
//            System.out.print(fruits.get(i) + " ");
//        }
//
//    }
//}

// Sort an ArrayList
// - Use the sort() method of the collections class for sorting lists alphabetically or numerically.


////////////////////////// For Each Loop in Java

///// Outline
// For each loop
// Iterating over arrays and arrayLists using a for each loop

// For each -> Usually used to iterate over Arrays and ArrayLists
// Syntax:
// for ( Type Var_name : ArrayList/Array) { ... }

// - in each iteration, the variable VAR_NAME will hold the value of an element inside the ArrayList/Array, starting from the first element.
// - There is no index -> We don't use the index to access the element
// - Safe (Boundaries) -> We don't exceed the array length

// example:

//package assunto;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<String> itemsArrayList = new ArrayList<>(Arrays.asList(
//                "Item1", "Item2", "Item3"
//        ));
//
//        String[] itemsArray = {"item1", "item2", "item3"};
//
//        for ( String item : itemsArrayList)
//            System.out.print(item + " ");
//
//        for ( String item : itemsArray)
//            System.out.print(item + " ");
//    }
//}

// Challenge -> WAP that prints the array elements concatinated with its index

//package assunto;
//
//public class Main {
//    public static void main(String[] args) {
//        int[] arr = {5, 2, 2, 0};
//
//        int i = 0;
//        for (int item : arr)
//            System.out.println(item + " " + i++);
//    }
//}


///////////////////// Introduction to Classes and Objects (Part 1)
///// Outline
// OOP & Objects
// Object's state, behavior, and identity


/////// OOP & Objects
///// OOP -> Object-oriented programming
// - Involves programming using objects.
// - An object represents an entity/object in the real world.
// - An object has a state, a behavior, and an identity.

// examples:
// - Student, circle, button, bank account
// - To represent a real world Point in programming we create a Point Object.

///// The State of an Object
///// Represented by the data fields of the object with their current values.
// - The state of an object is also known as its properties or attributes.
// - A point object, for example, has a data field x and data field y that characterizes a point.
// - A rectangle object, for example, has the data fields width and height, that characterizes a rectangle.

///// The behavior of an object
//// Defined by the methods of an object
// - The behavior of an object is also known as its actions.
// - To invoke/call a method on an object is to ask the object to perform an action -> str.charAt(2).

// For example, we can define the following methods for a Circle object:
// - getArea(): returns the area of the circle;
// - getPerimeter(): returns the perimeter of the circle;
// - getRadiues(radius): sets/changes the redius of the circle


///// The Identity of an object

// What makes an object unique


///////////////////// Introduction to Classes and Objects (Part 2)
///// Outline
// Classes & Objects
// Constructors
// Default constructors
// Graphical User Interface (GUI) & OOP

//// Classes & Objects
//// A Class defines the data fields and actions of an Object
// - To create an Object we need a template/blueprint that defines the data fields and methods that this Object will have
// -> Class.
// -> An object is an instance of a Class.

// - Objects of the same type are created/instantiated from the same class

// - A Java class uses variables to define the data fields and methods to define actions. There are special methods called Constructors.

///// Constructors
///// A method used to create Objects
// - A constructor can do anything, it is simply a method, but it is designed to do initializing actions, such as initializing the data fields of an object.

// example:
//Point p1 = new Point(0, 1);
//
//public Point(int x, int y) {
//    this.x = x;
//    this.y = y;
//}

///// Default Constructors
//// A constructor that takes no paramenters

// - If we create a class without creating a constructor, Java automatically creates a default constructor that takes no parameters and we will be able to use it to create objects of this class.


///// GUI -> Graphical User Interface



///////////////////// Creating a Class in Java
///// Outline
// Defining a Class
// Defining attributes
// Defining methods

// example: Circle

// - Data Fields (attributes):
//// -> center : Point
//// -> radius : double

// - Methods (actions):
//// -> getArea() : double
//// -> getPerimeter() : double
//// -> setRadius( newRadius : double ) : void
//// -> setCenter( newCenter : Point ) : void

// - Defining the circle class

//class Circle {
//
//}

// - There is no main() method, this class will be used to create Circle objects, not to run some code.
// - We will use this class in the main() method of our Main class

// Defining The Attributes

//class Circle {
//    Point center;
//    double radius;
//}

// - Declared directly inside the class
// - Can be accessed anywhere inside the class, inside all methods
// - Take default values (center is null & radius is 0.0)
// - Each object we create will have a center and a radius


// Defining the Methods

//import java.awt.*;
//
//class Circle {
//    Point center;
//    double radius;
//    double getPerimeter() {
//        return 2 * Math.PI * radius;
//    }
//    double getArea() {
//        return Math.PI * radius * radius;
//    }
//    void setRadius(double newRadius) {
//        radius = newRadius;
//    }
//    void setCenter(Point newCenter) {
//        center = newCenter;
//    }
//}


///////////////////// Instantiating Objects in Java
// Outline
// Instantiating Objects
// The new Keyword
// Accessing attributes & methods
// Changing the value of an attribute
// Default values

// Instantiating a circle object

//public static void main(String[] args) {
//
//    Circle c1 = new Circle(); // Default Constructor
//    System.out.println( c1.center ); // null
//    System.out.println( c1.radius ); // 0.0
//}

//import java.awt.*;
//
//// Default Values
//class DefaultValues {
//
//    Point point; // null
//    String str; //null
//    double d; // 0.0
//    int i; // 0
//    char c; // '\u0000'
//    boolean b; // false
//}

// Changing the value of attributes

//public static void main(String[] args) {
//
////    Circle c1 = new Circle();
////    c1.center = new Point(0, 0);
////    c1.radius = 3;
////
////    System.out.println( c1.center ); // java.awt.Point[x=0, y=0]
////    System.out.println( c1.radius ); // 3.0
//
//      // Another way
//
//      Circle c1 = new Circle();
//      c1.setCenter( new Point(1, 2) );
//      c1.setRadius( 5 );
//
//        System.out.println( c1.center ); // java.awt.Point[x=1, y=2]
////    System.out.println( c1.radius ); // 5.0
//}


// Getting the area and perimeter

//import java.awt.*;
//
//public class Main {
//    public static void main(String[] args) {
//
//        Circle c1 = new Circle();
//        c1.setCenter( new Point(1, 2) );
//        c1.setRadius( 5 );
//
//        System.out.println( "Area = " + c1.getArea());
//        System.out.println( "Perimeter = " + c1.getPerimeter() );
//    }
//}


/////////////////////////// Constructors in Java
///// Outline
// Constructors
// Default constructor
// Overloading constructors


// Constructors -> A method used to instantiate and initialize objects
// - A constructor must have the same name as the class;
// - Constructors do not have a return type;
// - Constructors are invoked using the new operator;
// - Constructors play the role of initializing objects;
// - A default constructor is a zero-argument constructor with an empty body.

// Circle

// - Data Fields (attributes):
//// -> center : Point
//// -> radius : double

// - Methods (actions):
//// -> Circle( initialCenter : Point, initialRadius : double)
//// -> getArea() : double
//// -> getPerimeter() : double
//// -> setRadius( newRadius : double ) : void
//// -> setCenter( newCenter : Point ) : void

//package assunto;
//import java.awt.*;
//
//public class Main {
//
//
//    // Instantiating Circle Objects
//    public static void main(String[] args) {
//        Circle c1 = new Circle(new Point(1, 2), 3);
//
//        System.out.println(c1.center);
//        System.out.println(c1.radius);
//    }
//    static class Circle {
//
//        Point center;
//        double radius;
//
//        Circle(Point initialCenter, double initialRadius) {
//            center = initialCenter;
//            radius = initialRadius;
//        }
//    }
//}

// Using the default Constructor

// - When no constructors are created, a default constructor is created automatically.

// - When a constructor is created, the default constructor is not created.
///// -> if you want a zero argument constructor, create one.


// Overloading Circle()

//import java.awt.*;
//
//class Circle {
//     Point center;
//     double radius;
//
////     Circle() { } // It is a Circle with default values
//
////    Modifying the default values
////    Circle() {
////         center = new Point(0, 0);
////         radius = 1;
////    }
//
//    Circle(Point initialCenter, double initialRadius) {
//         center = initialCenter;
//         radius = initialRadius;
//    }
//}


/////////////////// Creating a Class in Java - Practice
//package assunto;
//
//import java.awt.*;
//
//public class Main {
//    public static void main(String[] args) {
//        Circle c1 = new Circle(new Point(1, 2), 3);
//
//        System.out.println( c1.getArea() );
//    }
//}


///////////////////// Static Variables and Static Methods in Java
///// Outline
// Static variables and methods
// The static keyword
// Example

// How to share data between instances of the same class?

// Static variables & Methods

// Static variables and static methods belong to the class, they are shared between all objects.
// - If an object modifies a static variable, all objects of the same class are affected.
// - A static variable can be accessed without creating an instance of the class.(Because the static variable belongs to the class and does not belong to the object)
// A static method can be called using the same way. (We can access using an object or the name of the class).
// A static method can not access instance variables or methods.

//// The static keyword

//static int numberOfCircles;
//
//static int getNumberOfCircles() {
//    return numberOfCircles;
//}


//package assunto;
//
//import java.awt.*;
//
//public class Main {
//    public static void main(String[] args) {
//        System.out.println( Circle.getNumberOfCircles() );
//
//        Circle c1 = new Circle(new Point(1, 2), 3);
//        System.out.println( Circle.getNumberOfCircles() );
//        c1.numberOfCircles = 10;
//        Circle c2 = new Circle(new Point(2, 3), 2);
//        System.out.println( Circle.getNumberOfCircles() );
//    }
//}

///////////////////////// Visibility Modifiers in Java
///// Outline
// Visibility modifiers (Access modifiers )
// public & private visibility modifiers
// Default visibility


///// Visibility modifiers
// Visibility modifiers can be used to specify the visibility of a class and it's members
// - public: Can be used on classes and class members. Used for unrestricted access, i.e. can be used from any other class.
// - private: Can be used on class members. Used for restricting the access to the defining class, i.e. can be used accessed within the class only.

// - In no visibility modifier is used, then by default the classes, methods, and data fields are accessible by any class in the same package.

// example

//package assunto;
//
//public class Main {
//    public static void main(String[] args) {
//        Test test = new Test();
//
//        test.setX(10);
//        System.out.println(test.getX());
//    }
//}

///////////////////////// Data Field Encapsulation in Java
///// Outline
// Data field encapsulation
// Accessing private data fields
// Getters & Setters

///// Data field encapsulation
// Preventing direct modifications of data fields by declaring them as private using private visibility modifiers
// - The data fields radius and numberOfObjects of the Circle class can be modified directly, which makes the class difficult to maintain and vulnerable to bugs.


///// Accessing Private Data Fields
// A private data field cannot be accessed by an object from outside the class that defines the private field.
// - Getter(accessor): public propertyType getPropertyName()
// - Setter(mutator): public void setPropertyName(...)


// example
//package assunto;
//
//import java.awt.*;
//
//public class Main {
//    public static void main(String[] args) {
//        Circle.numberOfCircles = 10; // error because it is private
//
//        Circle c = new Circle(new Point(1, 1), 2);
//        c.radius = -4; // error because it is private
//    }
//}

//package assunto;
//
//import java.awt.*;
//
//public class Main {
//    public static void main(String[] args) {
//        Circle c = new Circle(new Point(1, 1), 2);
//        c.setRadius(-2);
//
//        System.out.println( c.getRadius() );
//        System.out.println( Circle.getNumberOfCircles() );
//    }
//}

//////////////////// Visibility Modifiers and Encapsulation - Practice

//package assunto;
//
//import assunto.p1.C1;
//
//public class Main {
//    public static void main(String[] args) {
//        new C1().setX(1);
//    }
//}

/////////////////////// Immutable Classes and Objects in Java
///// Outline
// Immutable Objects
// Immutable Classes
// Examples

///// Immutable Objects
// An object whose contents cannot be changed
// - Sometimes, we want to create an object whose contents cannot be changed once the object has been created. such an object is called an immutable object and its class is an immutable class.

// example: The String class is an immutable class, and String objects are immutable.

///// Immutable Classes
// - All data fields must be private.
// - There can't be any setter methods.
// - No getter methods can return a data field that is mutable.
/// -> If there is a getter method that returns an object, this object should be immutable.
/// -> Applies to data fields of reference type (objects).

//example 1:
// This class is immutable be cause we can't change it's value
//class C1 {
//    private int x;
//
//    public C1(int x) {
//        this.x = x;
//    }
//
//    public int getX() {
//        return this.x;
//    }
//}

// example 2:
// This class is muttable because we can change it's value
//class C2 {
//    private int x;
//
//    public C2(int x) {
//        this.x = x;
//    }
//
//    public void setX(int x) {
//        this.x = x;
//    }
//}

// example 3:
// This class is immutable
//class C1 {
//    private int x;
//    private C2 c2;
//
//    public C1(int x, C2 c2) {
//        this.x = x;
//        this.c2 = c2;
//    }
//
//    public int getX() {
//        return this.x;
//    }
//}

// example 4:

// This class is mutable

//class C1 {
//    private int x;
//    private C2 c2;
//
//    public C1(int x, C2 c2) {
//        this.x = x;
//        this.c2 = c2;
//    }
//
//    public C2 getC2() {
//        return this.c2;
//    }
//
//    public int getX() {
//        return this.x;
//    }
//}


////////////////////////// The this Keyword in Java
///// Outline
// The this keyword
// Referencing instance members using this
// Invoking an overloaded constructor using this
// this and static variables


///// THIS
// The this keyword refers to the object itself

// Can be used to:
/// - Reference instance data fields
/// - Reference instance methods
/// - Invoke a constructor


////// Referencing data fields

// example
//public class C1{
//    private int x;
//
//    public void setX(int x) {
//        x = x; // Wrong
//    }
//}

//public class C1{
//    private int x;
//
//    public void setX(int x) {
//        this.x = x; // Right way
//    }
//}


// Note: Don't do it, because you will be repeating the same code

//public class C1{
//    private int x;
//
//    public C1(int x) {
//        if (x >= 0)
//            this.x = x;
//        else
//            this.x = 0;
//    }
//
//    public void setX(int x) {
//        if (x >= 0)
//            this.x = x;
//        else
//            this.x = 0;
//    }
//}

// Do this instead

//public class C1{
//    private int x;
//
//    public C1(int x) {
//        setX(x);
//    }
//
//    public void setX(int x) {
//        if (x >= 0)
//            this.x = x;
//        else
//            this.x = 0;
//    }
//}


///////// Referencing methods

// The following two codes are the same code

//public class C1{
//    private int x;
//
//    public C1(int x) {
//        setX(x);
//    }
//
//    public void setX(int x) {
//        this.x = x;
//    }
//}

//public class C1{
//    private int x;
//
//    public C1(int x) {
//        this.setX(x);
//    }
//
//    public void setX(int x) {
//        this.x = x;
//    }
//}

/////// Invoking Constructors

import assunto.Outer;

import java.awt.*;

//public class Circle{
//
//    private Point center;
//    private double radius;
//
//    public Circle() {
//        this(new Point(1, 2), 1);
//    }
//
//    public Circle(Point center, double radius) {
//        this.center = center;
//        this.radius = radius;
//    }
//}



///////////// This and static variables

//public class Circle{
//
//    private  static int k;
//    public static void setK(int k) {
////        this.k = k; // error: Because we can't use this on static variables.
//        Circle.k; // we use the name of the class
//    }
//
//    public static int getK() {
////        return this.k; // error: Because we can't use this on static variables.
//        return Circle.k; // we use the name of the class
//    }
//}


///////////////////////////// Inner Classes in Java
///// Outline
// Member Classes & Static Member Classes
// Creating instances of inner classes
// Inner Classes and Visibility Modifiers
// Inner Classes and static variables



////////// Inner classes
// A classe inside another class
// We will talk about two inner classes:
/// - Member Class
/// - Static Member Class

// An inner class can:
/// - Access private members of the containing class.
/// - Have a private access modifier. -> if we want to restric a class to one class only


////////////// Member Class

//public class Outer {
//    class Inner {
//        private int x;
////        private static int x; // error: members classes cannot contain static variables
//        public Inner(int x) {
//            this.x = x;
//        }
//        public int getX() {
//            return x;
//        }
//
//        public void setX(int x) {
//            this.x = x;
//        }
//    }
//}


//// create an inner object
//public class Main {
//    public static void main(String[] args) {
//        Outer outer = new Outer();
//        outer.demo();
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        Outer outer = new Outer();
//        Outer.Inner inner = Outer.new Inner();
//
//        inner.innerX = 5;
//        inner.showX();
//    }
//}


///// Visibility

















































