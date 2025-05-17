import java.util.Scanner;

public class Replacement {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] arr = new int[N];
        int x = 0;
        for (int i = 0; i < N; i++) {
            x = input.nextInt();
            if (x > 0) {
                arr[i] = 1;
            } else if (x < 0) {
                arr[i] = 2;
            } else {
                arr[i] = 0;
            }
        }
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i]+" ");        }
    }
}

