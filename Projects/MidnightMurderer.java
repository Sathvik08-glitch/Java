import java.util.*;

// ========================== ABSTRACTION ==========================
abstract class Person {

    // ========================== ENCAPSULATION ==========================
    private String name;

    public Person(String name) {
        this.name = name;
    }

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    // Abstract method
    abstract void speak();
}

// ========================== INHERITANCE ==========================
class Suspect extends Person {

    private String role;

    public Suspect(String name, String role) {
        super(name);
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    // ========================== POLYMORPHISM + METHOD OVERRIDING ==========================
    @Override
    void speak() {
        System.out.println(getName() + " seems suspicious during questioning...");
    }

    // ========================== METHOD OVERLOADING ==========================
    public void investigate() {
        System.out.println("Investigating suspect...");
    }

    public void investigate(String location) {
        System.out.println("Investigating " + location + " carefully...");
    }
}

public class MidnightMurderer {

    // ========================== METHODS ==========================
    // Exception Handling
    public static int getValidInput(Scanner sc) {

        while (true) {

            try {
                int input = sc.nextInt();
                return input;
            }

            catch (InputMismatchException e) {
                System.out.print("Invalid input! Please enter a number: ");
                sc.next();
            }
        }
    }

    // ========================== THREADING ==========================
    public static void pause() {

        try {
            Thread.sleep(1500);
        }

        catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean playAgain = true;

        // ========================== LOOPS ==========================
        while (playAgain) {

            int score = 0;

            // ========================== COLLECTIONS ==========================
            List<String> collectedClues = new ArrayList<>();

            Set<Integer> visitedLocations = new HashSet<>();

            // ========================== OBJECTS ==========================
            Suspect friend = new Suspect("Rahul", "Close Friend");

            Suspect partner = new Suspect("Vikram", "Business Partner");

            Suspect servant = new Suspect("Ramu", "House Servant");

            // Suspect list
            List<Suspect> suspects = new ArrayList<>();

            suspects.add(friend);
            suspects.add(partner);
            suspects.add(servant);

            // ========================== RANDOMIZATION ==========================
            Random rand = new Random();

            int killerIndex = rand.nextInt(3);

            Suspect killer = suspects.get(killerIndex);

            // Random clue pool
            List<String> cluePool = new ArrayList<>(Arrays.asList(
                    "Knife",
                    "Letter",
                    "Fingerprint"
            ));

            Collections.shuffle(cluePool);

            // ========================== HASHMAP ==========================
            // Location -> Clue
            Map<Integer, String> locationClues = new HashMap<>();

            locationClues.put(1, cluePool.get(0));
            locationClues.put(2, cluePool.get(1));
            locationClues.put(3, cluePool.get(2));

            // Suspect -> Clue
            Map<Suspect, String> suspectClues = new HashMap<>();

            suspectClues.put(friend, "Letter");
            suspectClues.put(partner, "Knife");
            suspectClues.put(servant, "Fingerprint");

            System.out.println("\n========================================");
            System.out.println(" DETECTIVE CASE FILES ");
            System.out.println("========================================");

            System.out.println("Case: The Midnight Murder\n");

            // ========================== STORY ==========================
            System.out.println("Story:");

            System.out.println("At exactly 10:30 PM, a wealthy businessman was found dead in his mansion.");

            System.out.println("There were no signs of forced entry, suggesting the killer was someone known to him.");

            System.out.println("Three suspects were present in the house during the incident:\n");

            System.out.println("1. Rahul - A close friend who visited earlier that evening.");

            System.out.println("2. Vikram - A business partner involved in financial disputes.");

            System.out.println("3. Ramu - A loyal servant who worked there for years.\n");

            System.out.println("Your mission:");

            System.out.println("- Investigate locations");

            System.out.println("- Collect clues");

            System.out.println("- Interrogate suspects");

            System.out.println("- Identify the killer using logic\n");

            System.out.println("Press Enter to begin investigation...");

            sc.nextLine();
            sc.nextLine();

            pause();

            // ========================== INVESTIGATION ==========================
            for (int i = 1; i <= 2; i++) {

                int location;

                while (true) {

                    System.out.println("\n========== Investigation Round " + i + " ==========");

                    System.out.println("1. Crime Scene");

                    System.out.println("2. Victim's House");

                    System.out.println("3. Office");

                    System.out.print("Choose a location: ");

                    location = getValidInput(sc);

                    // ========================== CONDITIONALS ==========================
                    if (!visitedLocations.contains(location)) {

                        visitedLocations.add(location);

                        break;
                    }

                    else {

                        System.out.println("Location already investigated! Choose another one.");
                    }
                }

                String clueFound = locationClues.get(location);

                System.out.println("\nInvestigating area...");

                pause();

                System.out.println("You discovered an important clue: " + clueFound);

                collectedClues.add(clueFound);

                score += 10;
            }

            System.out.println("\nCollected Clues: " + collectedClues);

            pause();

            // ========================== INTERROGATION ==========================
            System.out.println("\n========== INTERROGATION ==========");

            System.out.println("1. Rahul");

            System.out.println("2. Vikram");

            System.out.println("3. Ramu");

            System.out.print("Choose a suspect to interrogate: ");

            int suspectChoice = getValidInput(sc);

            Suspect selectedSuspect = suspects.get(suspectChoice - 1);

            // Polymorphism
            selectedSuspect.speak();

            // Overloaded methods
            selectedSuspect.investigate();

            selectedSuspect.investigate(selectedSuspect.getRole());

            System.out.println("The suspect appears nervous during questioning.");
            System.out.println("You notice unusual behavior, but nothing conclusive yet.");

            pause();

            // ========================== FINAL DECISION ==========================
            System.out.println("\n========== FINAL DECISION ==========");

            System.out.println("Who is the killer?");

            System.out.println("1. Rahul");

            System.out.println("2. Vikram");

            System.out.println("3. Ramu");

            System.out.print("Enter your accusation: ");

            int finalChoice = getValidInput(sc);

            Suspect accused = suspects.get(finalChoice - 1);

            pause();

            System.out.println("\n========== RESULT ==========");

            boolean correctLogic =
                    collectedClues.contains(suspectClues.get(killer));

            // ========================== CONDITIONAL ENDINGS ==========================
            if (accused == killer && correctLogic) {

                score += 30;

                System.out.println("🏆 PERFECT ENDING!");

                System.out.println("You solved the case using strong evidence and logical deduction.");
            }

            else if (accused == killer) {

                score += 15;

                System.out.println("😐 LUCKY ENDING!");

                System.out.println("You identified the killer but lacked proper evidence.");
            }

            else if (collectedClues.size() < 2) {

                System.out.println("😈 TWIST ENDING!");

                System.out.println("You missed important clues. The killer escaped during the confusion.");
            }

            else {

                System.out.println("❌ FAILURE ENDING!");

                System.out.println("Wrong accusation. The real killer escaped.");
            }

            // Reveal killer
            System.out.println("\nActual Killer: " + killer.getName());
            System.out.println("Reason:");

            String killerClue = suspectClues.get(killer);

            if (killerClue.equals("Knife")) {
                   System.out.println("The bloody knife discovered during investigation directly linked the killer to the crime scene.");
            }

            else if (killerClue.equals("Letter")) {
                   System.out.println("The secret letter revealed hidden motives and exposed the killer's intentions.");
            }

            else if (killerClue.equals("Fingerprint")) {
                   System.out.println("The fingerprints found during investigation matched the killer's presence at the scene.");
            }
            // ========================== SCORE SYSTEM ==========================
            System.out.println("Your Score: " + score);

            if (score >= 50) {

                System.out.println("🏆 Rank: Master Detective");
            }

            else if (score >= 30) {

                System.out.println("👍 Rank: Skilled Investigator");
            }

            else {

                System.out.println("❌ Rank: Rookie Detective");
            }

            // Replay
            System.out.println("\nDo you want to play again? (yes/no)");

            String replay = sc.next();

            playAgain = replay.equalsIgnoreCase("yes");
        }

        sc.close();

        System.out.println("\nThank you for playing Detective Case Files!");
    }
}