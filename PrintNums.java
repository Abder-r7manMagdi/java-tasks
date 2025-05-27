import java.util.Scanner;

public class PrintNums {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int num= input.nextInt();
        int i=0;
        while (num>=i){
            System.out.print("["+i+"]");
            i++;
        }
    }
}
