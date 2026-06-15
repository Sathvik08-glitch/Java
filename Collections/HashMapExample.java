package Collections;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {

        HashMap<String, String> pokemon = new HashMap<>();

        pokemon.put("Pikachu", "Electric");
        pokemon.put("Squirtle", "Water");
        pokemon.put("Bulbasaur", "Grass");
        pokemon.put("Charmander", "Fire");

        System.out.println("Pokemon Types: " + pokemon);

        System.out.println("Pikachu Type: " + pokemon.get("Pikachu"));

        pokemon.remove("Squirtle");

        System.out.println("After Removal: " + pokemon);

        System.out.println("Number of Pokemon: " + pokemon.size());
    }
}
