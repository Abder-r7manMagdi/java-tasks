import java.util.Scanner;

public class LetterGrade {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Grade: ");
        double grade = input.nextDouble();

        if (grade < 50)
            System.out.print("F");
        else if (grade >= 50 && grade < 65)
            System.out.print("D");
        else if (grade >= 65 && grade < 75)
            System.out.print("C");
        else if (grade >= 75 && grade < 85)
            System.out.print("B");
        else if (grade >= 85 && grade <= 100)
            System.out.print("A");
        else
            System.out.print("Invalid grade");
    }
}
