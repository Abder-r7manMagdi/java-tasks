import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in kilograms:");
        double weight =input.nextDouble();
        System.out.print("Enter height in meters:");
        double height =input.nextDouble();
        double bmi =  weight / (height*height);
        System.out.printf("BMI is: %.2f", bmi );
        System.out.println(" ");
        if(bmi<18.5)System.out.print("Underweight");
        else if (bmi>18.5 && bmi<24.9) System.out.print("Healthy weight");
        else System.out.print("Overweight");
    }
}
