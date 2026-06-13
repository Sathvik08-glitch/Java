package Basics;

public class Arrays {
    public static void main(String [] args) {

        int[] marks = {85, 90, 74, 88, 97};
        System.out.println("Marks of students:");

        System.out.println("First mark: " + marks[0]);
        System.out.println("Last mark: " + marks[4]);
        
        System.out.println("All marks:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
    }
}
