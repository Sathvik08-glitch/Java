package Basics;

public class Methods {

    public static void greet() {
        System.out.println("Hello, Sathvik!");
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        greet();

        int sum = add(10, 20);

        System.out.println("Sum = " + sum);
    }
}