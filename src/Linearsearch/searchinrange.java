package Linearsearch;

public class searchinrange {
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 14, 28};
        int target = 12;
        System.out.println(linearsearch(arr, target, 1,4));
    }
    static int linearsearch(int[]arr, int target, int start,int end) {
        if (arr.length == 0) {
            return -1;
        }

        // run for a loop
        for (int index = start; index <= end; index++){
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return -1; // then a not number a match is show -1
            }
        }

