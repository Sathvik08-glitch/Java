package Basics;

public class Loops {
    public static void main(String [] args) {
        
        // For Loop
        System.out.println("For loop");
        for(int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        // While Loop
        System.out.println("While Loop");
        int j = 0;
        while(j < 5) {
            System.out.println(j);
            j++;
        }

        // Do-While Loop
        System.out.println("Do-While Loop");
        int k = 0;
        do {
            System.out.println(k);
            k++;
        } while(k < 5);

        // Break 
        System.out.println("Break Statement");
        for (int i =0; i < 10; i++) {
            if (i == 5) {
                break;
            } 
            System.out.println(i);
        }

        // Continue
        System.out.println("Continue Statement");
        for(int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
