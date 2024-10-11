package shortingShradhadi;

public class Mergesort {

    // Function to print array
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Merge function to merge two sorted subarrays
    public static void merge(int arr[], int si, int ei, int mid) {
        int temp[] = new int[ei - si + 1];
        int i = si;  // Starting index of left subarray
        int j = mid + 1;  // Starting index of right subarray
        int k = 0;  // Index for the temp array

        // Merge the two sorted subarrays
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // Handle the remaining elements of the left subarray
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Handle the remaining elements of the right subarray
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // Copy the temp array back to the original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    // Merge Sort function (recursive)
    public static void mergeSort(int arr[], int si, int ei) {
        if (si < ei) {
            int mid = si + (ei - si) / 2;  // Find the middle point

            // Recursively sort the first and second halves
            mergeSort(arr, si, mid);
            mergeSort(arr, mid + 1, ei);

            // Merge the sorted halves
            merge(arr, si, ei, mid);
        }
    }

    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};

        System.out.println("Original array:");
        printArr(arr);

        // Apply merge sort
        mergeSort(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");
        printArr(arr);
    }
}



