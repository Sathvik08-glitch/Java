package Collections;

import java.util.ArrayList;

public class ArraylistExample {
    public static void main(String []args){

        ArrayList<String> pokemon = new ArrayList<String>();

        pokemon.add("Bulbasaur");
        pokemon.add("Squirtle");
        pokemon.add("Charmander");
        pokemon.add("Pikachu");

        System.out.println("Starter Pokemon: " + pokemon);

        pokemon.remove("Pikachu");
        System.out.println("Original Starter Pokemon:" + pokemon);

        System.out.println("No of Starter Pokemon: " + pokemon.size());

        System.out.println("First Starter Pokemon: " + pokemon.get(0));
        System.out.println("Second Starter Pokemon: " + pokemon.get(1));
        System.out.println("Third Starter Pokemon: " + pokemon.get(2));
    }
}
