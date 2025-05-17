import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }
        boolean palindrome = true;
        for (int i = 0; i <= n / 2; i++) {
            if (a[i] != a[n - 1 - i])  {
                palindrome = false;
                break;
            }
        }
        if (palindrome)System.out.print("YES");
        else System.out.print("NO");
    }
}
