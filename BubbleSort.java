public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 3};
        int n = arr.length;
        int step = 0;

        // طباعة المصفوفة الأصلية
        printArray(arr, step++); // Step 0

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                printArray(arr, step++); // Step 1, 2, ...
            }
        }
    }

    static void printArray(int[] arr, int step) {
        System.out.print("Step " + step + ": ");
        for (int num : arr) System.out.print(num + " ");
        System.out.println();
    }
}
