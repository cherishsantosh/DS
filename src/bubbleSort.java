public class bubbleSort {
    public static void main(String[] args) throws Exception {
        int arr[] = { 1, 5, 3, 8, 20, 4, 60 };
        
        printArray(arr, "before"); // Print
        
        //bubble sort
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                //swap
                if (arr[j] > arr[j+1]) {
                    int temp1 = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp1;
                }
            }
        }
        printArray(arr, "after"); // Print
    }

    // Print array
    public static void printArray(int arr[], String mode) {
        System.out.print("Array "+mode+" bubble sort :");
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    } 
}
