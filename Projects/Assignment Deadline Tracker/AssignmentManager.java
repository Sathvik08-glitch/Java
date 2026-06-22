import java.util.ArrayList;

public class AssignmentManager {

    private ArrayList<Assignment> assignments = new ArrayList<>();

    public void addAssignment(Assignment task) {
        assignments.add(task);

    }

    public void viewAssignments() {

    if (assignments.isEmpty()) {
        System.out.println("No assignments found.");
        return;
    }

    for (Assignment task : assignments) {
        System.out.println(task);
        System.out.println();
    }
    }
}