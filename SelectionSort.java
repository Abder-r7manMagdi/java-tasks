public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 3};
        int n = arr.length;
        int step = 0;

        printArray(arr, step++); // Step 0

        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;

            printArray(arr, step++);
        }
    }

    static void printArray(int[] arr, int step) {
        System.out.print("Step " + step + ": ");
        for (int num : arr) System.out.print(num + " ");
        System.out.println();
    }
}
