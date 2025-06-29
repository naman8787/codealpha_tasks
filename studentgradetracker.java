import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an ArrayList to store student grades
        ArrayList<Integer> grades = new ArrayList<>();

        // Get the number of students from the user
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        // Input grades for each student
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter grade for student " + (i + 1) + ": ");
            int grade = scanner.nextInt();
            grades.add(grade);
        }

        // Calculate average, highest, and lowest grades
        double average = calculateAverage(grades);
        int highest = calculateHighest(grades);
        int lowest = calculateLowest(grades);

        // Display results
        System.out.println("Average grade: " + average);
        System.out.println("Highest grade: " + highest);
        System.out.println("Lowest grade: " + lowest);

        scanner.close();
    }

    // Calculate average of grades
    private static double calculateAverage(ArrayList<Integer> grades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }

    // Calculate highest grade
    private static int calculateHighest(ArrayList<Integer> grades) {
        return Collections.max(grades);
    }

    // Calculate lowest grade
    private static int calculateLowest(ArrayList<Integer> grades) {
        return Collections.min(grades);
    }
}
