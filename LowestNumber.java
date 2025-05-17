import java.util.Scanner;

public class LowestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }
        int lowestNumber = a[0];
        int lowestNumberIndex=1;

        for (int i = 1; i < n; i++) {
            if (lowestNumber > a[i]) {
                lowestNumber = a[i];
                lowestNumberIndex = i+1;
            }
        }
        System.out.println(lowestNumber+" "+lowestNumberIndex);
    }
}
