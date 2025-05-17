import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        // Checking if the number is positive, negative, or zero
        if (number > 0) {
            System.out.println(number + " is a Positive number.");
        } else if (number < 0) {
            System.out.println(number + " is a Negative number.");
        } else {
            System.out.println("The number is Zero.");
        }

        scanner.close();
    }
}
