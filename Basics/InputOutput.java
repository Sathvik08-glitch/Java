package Basics;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
      
        try(Scanner sc = new Scanner(System.in)) {


        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Hello, I am " + name + "! I am " + age + " years old.");
        sc.close();
        }
    }    
}
