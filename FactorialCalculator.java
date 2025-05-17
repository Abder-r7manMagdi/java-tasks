import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        long factorial = 1; // Initialize factorial as 1

        // Calculating factorial using a for loop
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        // Printing the factorial
        System.out.println("Factorial of " + num + " is: " + factorial);

        scanner.close();
    }
}
