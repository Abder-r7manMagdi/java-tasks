import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking percentage input from the user
        System.out.print("Enter your percentage: ");
        double percentage = scanner.nextDouble();

        // Assigning grades based on percentage
        char grade;
        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else if (percentage >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        // Printing the grade
        System.out.println("Your grade is: " + grade);

        scanner.close();
    }
}
