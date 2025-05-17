import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args){
        int qroosh,halves,quarters;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount of qroosh :");
        qroosh=input.nextInt();
        if (qroosh > 100 || qroosh < 0 ){
            System.out.print("Enter a valid amount of qroosh (0:99) :");
            qroosh=input.nextInt();
        }
        halves=qroosh/50;
        qroosh%=50;
        quarters=qroosh/25;
        qroosh%=25;
        System.out.println("The amount you entered contains: ");
        System.out.println(halves + " Halves");
        System.out.println(quarters + " Quarters");
        System.out.println(qroosh + " Qroosh");    }
}