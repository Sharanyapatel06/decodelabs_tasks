import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input number of subjects
        System.out.print("Enter the number of subjects: ");
        int subjects = sc.nextInt();

        int totalMarks = 0;

        // Taking marks for each subject
        for (int i = 1; i <= subjects; i++) {
            System.out.print("Enter marks for Subject " + i + " (out of 100): ");
            int marks = sc.nextInt();

            // Validation
            while (marks < 0 || marks > 100) {
                System.out.print("Invalid marks! Enter marks between 0 and 100: ");
                marks = sc.nextInt();
            }

            totalMarks += marks;
        }

        // Calculate average percentage
        double averagePercentage = (double) totalMarks / subjects;

        // Grade assignment
        char grade;

        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Pass/Fail status
        String result = (averagePercentage >= 40) ? "PASS" : "FAIL";

        // Display result
        System.out.println("\n===== STUDENT RESULT =====");
        System.out.println("Total Marks: " + totalMarks);
        System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
        System.out.println("Grade: " + grade);
        System.out.println("Result: " + result);

        sc.close();
    }
}