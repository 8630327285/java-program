package Linearsearch;

public class linarsearch1 {
    public static void main(String[] args) {
        // search in the array
        int[] nums = {23, 45, 1, 2, 8, 19, -3, 16, -11};
        int target = 8;
        int ans = linearsearch(nums, target);
        System.out.println(ans);
    }

    static int linearsearch(int[]arr,int target){
        if(arr.length == 0) {
            return -1;
        }
        for (int index=0; index < arr.length; index++) {

            int element = arr[index];
            if(element == target) {

                return index;
            }
        }
        return -1;

            }
        }
