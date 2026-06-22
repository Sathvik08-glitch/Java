import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String[][] timetable = new String[8][5];

        try (Scanner sc = new Scanner(System.in)) {

            boolean running = true;

            while (running) {

                System.out.println("\n===== Timetable Conflict Resolver =====");
                System.out.println("1. Add Class");
                System.out.println("2. View Timetable");
                System.out.println("3. Exit");
                System.out.print("Enter Choice: ");

                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {

                    case 1:

                        System.out.print("Enter Subject: ");
                        String subject = sc.nextLine();

                        System.out.print("Enter Day (Mon/Tue/Wed/Thu/Fri): ");
                        String day = sc.nextLine();

                        System.out.print("Enter Hour (9-16): ");
                        int hour = sc.nextInt();
                        sc.nextLine();

                        int row = hour - 9;
                        int col = getDayIndex(day);

                        if (col == -1) {
                            System.out.println("Invalid Day!");
                            break;
                        }

                        if (timetable[row][col] != null) {

                            System.out.println("Conflict Detected!");
                            System.out.println(
                                    subject + " conflicts with "
                                            + timetable[row][col]
                            );

                        } else {

                            timetable[row][col] = subject;
                            System.out.println("Class Added Successfully!");
                        }

                        break;

                    case 2:

                        System.out.println();

                        System.out.println(
                                "\tMon\tTue\tWed\tThu\tFri"
                        );

                        for (int i = 0; i < 8; i++) {

                            System.out.print((i + 9) + "\t");

                            for (int j = 0; j < 5; j++) {

                                if (timetable[i][j] == null) {
                                    System.out.print("-\t");
                                } else {
                                    System.out.print(
                                            timetable[i][j] + "\t"
                                    );
                                }
                            }

                            System.out.println();
                        }

                        break;

                    case 3:

                        running = false;
                        System.out.println("Exiting...");
                        break;

                    default:

                        System.out.println("Invalid Choice!");
                }
            }
        }
    }

    public static int getDayIndex(String day) {

        switch (day.toLowerCase()) {

            case "mon":
                return 0;

            case "tue":
                return 1;

            case "wed":
                return 2;

            case "thu":
                return 3;

            case "fri":
                return 4;

            default:
                return -1;
        }
    }
}
