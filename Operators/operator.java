//Function for Arithmetic Operators (+, -, , /)
public class ArithmeticOperators {
    public static void main(String[] args) {
        int a = 20, b = 10;

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
    }
}


// Method for Increment and Decrement Operators (++ and --)
public class IncrementDecrement {
    public static void main(String[] args) {
        int a = 5;

        System.out.println("Original: " + a);
        System.out.println("Post-increment: " + a++);
        System.out.println("After Post-increment: " + a);
        System.out.println("Pre-increment: " + ++a);
        System.out.println("Post-decrement: " + a--);
        System.out.println("After Post-decrement: " + a);
        System.out.println("Pre-decrement: " + --a);
    }
}


// Program for Equal and Not Equal Operators
public class EqualNotEqual {
    public static void main(String[] args) {
        int x = 10, y = 20;

        System.out.println("x == y: " + (x == y));
        System.out.println("x != y: " + (x != y));
    }
}


//Check if Two Numbers are Equal
import java.util.Scanner;

public class CheckEquality {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        if (a == b) {
            System.out.println("Both numbers are equal.");
        } else {
            System.out.println("Numbers are not equal.");
        }
    }
}


// Logical AND, OR, NOT Operators
public class LogicalOperators {
    public static void main(String[] args) {
        boolean a = true, b = false;

        System.out.println("AND (a && b): " + (a && b));
        System.out.println("OR (a || b): " + (a || b));
        System.out.println("NOT (!a): " + (!a));
    }
}


// Relational Operators (<, <=, >, >=)
public class RelationalOperators {
    public static void main(String[] args) {
        int a = 15, b = 20;

        System.out.println("a < b: " + (a < b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a >= b: " + (a >= b));
    }
}


// Print the Smaller and Larger Number
import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("Larger number: " + a);
            System.out.println("Smaller number: " + b);
        } else if (b > a) {
            System.out.println("Larger number: " + b);
            System.out.println("Smaller number: " + a);
        } else {
            System.out.println("Both numbers are equal.");
        }
    }
}