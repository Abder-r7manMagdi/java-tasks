import java.util.Scanner;

public class PositionsInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = input.nextInt();
        }
        for (int i = 0; i < N; i++) {
            if (A[i] <= 10) System.out.println("A[" + i + "] = " + A[i]);
        }
    }
}
