//package shortingShradhadi;
//
//import java.sql.SQLOutput;
//
//public class QuickSort {
//    public static void PrintArr(int Arr[]){
//        for(int i=0; i < Arr.length; i++){
//            System.out.print(Arr[i]+" ");
//
//        }
//        System.out.println();
//
//    }
//    public static void quicksort(int arr[], int si, int  ei){
//        if(si>=ei){
//            return;
//
//        }
//        int pIdx = parition(arr,si,ei);
//        quicksort(arr,si,pIdx-1);   //left
//        quicksort(arr,pIdx+1,ei);  // right
//    }
//    public static int parition(int arr[],int si,int ei){
//        int pivot = arr[ei];
//        int i = si-1;
//
//        for(int j=0; j<ei; j++){
//            if(arr[j] <=pivot){
//                i++;
//                //swap
//                int temp=arr[j];
//                arr[j]=arr[i];
//                arr[i]= temp;
//
//
//            }
//        }
//        i++;
//        int temp=pivot;
//        arr[ei]=arr[i];
//        arr[i]= temp;
//        return i;
//
//
//
//    }
//
//    public static void main(String[] args) {
//        int arr[] = {6,3,9,8,2,5};
//        quicksort(arr,0,arr.length-1);
//        PrintArr(arr);
//    }
//}


public class QuickSort {
    // Print the array
    public static void PrintArr(int Arr[]) {
        for (int i = 0; i < Arr.length; i++) {
            System.out.print(Arr[i] + " ");
        }
        System.out.println();
    }

    // QuickSort function
    public static void quicksort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int pIdx = partition(arr, si, ei); // Find pivot index
        quicksort(arr, si, pIdx - 1);      // Left part
        quicksort(arr, pIdx + 1, ei);      // Right part
    }

    // Partition function
    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];  // Pivot is the last element
        int i = si - 1;       // Index of smaller element

        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap pivot element with the element at i+1
        i++;
        int temp = arr[i];
        arr[i] = arr[ei];
        arr[ei] = temp;

        return i;  // Return the partition index
    }

    // Main method
    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 8, 2, 5};
        quicksort(arr, 0, arr.length - 1);
        PrintArr(arr);  // Call the corrected method
    }
}
