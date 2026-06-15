package Collections;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String []args){

        HashSet<Integer> numbers = new HashSet();

        numbers.add(10);
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(40);
        numbers.add(40);
        numbers.add(50);

        System.out.println("Size of Elements in the List: " + numbers.size());
        System.out.println("Numbers: " + numbers);

        boolean removed = numbers.remove(20);

        System.out.println("Was 20 removed? " + removed);
        System.out.println("Size of Elements in the Set after Removal: " + numbers.size());
        System.out.println("Numbers after Removal: " + numbers);
    }
}
