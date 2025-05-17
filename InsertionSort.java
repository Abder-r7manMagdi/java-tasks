public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 3};
        int n = arr.length;
        int step = 0;

        printArray(arr, step++); // Step 0

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
                printArray(arr, step++);
            }
            arr[j + 1] = key;
            printArray(arr, step++);
        }
    }

    static void printArray(int[] arr, int step) {
        System.out.print("Step " + step + ": ");
        for (int num : arr) System.out.print(num + " ");
        System.out.println();
    }
}
