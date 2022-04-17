public class insertionSort {
    public static void main(String args[]) {
        int arr[] = { 7, 8, 1, 3, 2 };
        
        // insertion sort
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;

            while (j >= 0 && current < arr[j]) {
                arr[j+1] = arr[j];
                j--;
            }
            // Placement
            arr[j+1] = current;
        }
        printArray(arr, "eee");
    }

    // Print array
    public static void printArray(int arr[], String mode) {
        System.out.print("Array " + mode + " bubble sort :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
