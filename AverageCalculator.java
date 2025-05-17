import java.util.Scanner;
public class AverageCalculator {
    public static void main(String args[]){
        double a,b,c;
        System.out.println("Enter the 3 numbers:");
        Scanner input=new Scanner(System.in);
        a= input.nextDouble();
        b= input.nextDouble();
        c= input.nextDouble();
        double average=(a+b+c)/3;
        System.out.println("The average as an integer: " + ((int) average));
        input.close();
    }
}
