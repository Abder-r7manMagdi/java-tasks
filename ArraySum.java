import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        long sum = 0;

        for (int i = 0; i < n; i++) {
            sum += scanner.nextLong();
        }

        System.out.println(Math.abs(sum));
    }
}
