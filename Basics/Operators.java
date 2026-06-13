package Basics;

public class Operators {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        // Arithmetic 
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        // Relational 
        System.out.println("a > b : " + (a > b));
        System.out.println("a < b : " + (a < b));
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));

        // Logical 
        boolean x = true;
        boolean y = false;

        System.out.println("x && y : " + (x && y));
        System.out.println("x || y : " + (x || y));
        System.out.println("!x : " + (!x));

        // Assignment
        int c = 10;
        c += 5;
        System.out.println("c += 5 : " + c);

        c -= 3;
        System.out.println("c -= 3 : " + c);

        // Unary 
        int d = 5;
        System.out.println("d++ : " + (d++));
        System.out.println("After d++ : " + d);

        System.out.println("++d : " + (++d));

        // Ternary 
        String result = (a > b) ? "a is greater" : "b is greater";
        System.out.println(result);
    }
}