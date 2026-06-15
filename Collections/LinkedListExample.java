package Collections;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String [] args){

          LinkedList<String> groceries = new LinkedList<>();

    groceries.add("Milk");
    groceries.add("Eggs");
    groceries.add("Bread");

    System.out.println("Groceries List : " + groceries);

    groceries.remove("Bread");

    System.out.println("Available Groceries: " + groceries);
    }
}
