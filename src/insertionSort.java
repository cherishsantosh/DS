public class insertionSort {
    public static void main(String[] args) throws Exception {
        int arr[] = { 1, 5, 3, 8, 20, 4, 60 };

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp1 = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp1;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
