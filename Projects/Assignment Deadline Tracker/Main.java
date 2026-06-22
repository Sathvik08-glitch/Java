import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            AssignmentManager manager = new AssignmentManager();

            boolean running = true;

            while (running) {

                System.out.println("====== Assignment Tracker ======");
                System.out.println("1. Add your Assignment");
                System.out.println("2. View your Assignments");
                System.out.println("3. Exit");

                System.out.print("Enter Choice: ");
                int choice = sc.nextInt();

                switch (choice) {

                    case 1:

                        sc.nextLine();

                        System.out.print("Enter Assignment Title: ");
                        String title = sc.nextLine();

                        System.out.print("Enter Subject: ");
                        String subject = sc.nextLine();

                        System.out.print("Enter Deadline: ");
                        String deadline = sc.nextLine();

                        Assignment task = new Assignment(
                                title,
                                subject,
                                deadline
                        );

                        manager.addAssignment(task);

                        System.out.println("Assignment Added Successfully!");
                        System.out.println();

                        break;

                    case 2:

                        manager.viewAssignments();

                        break;

                    case 3:

                        System.out.println("Exiting...");
                        running = false;

                        break;

                    default:

                        System.out.println("Invalid Choice");
                }
            }
        }
    }
}
