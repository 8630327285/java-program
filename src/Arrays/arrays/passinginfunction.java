package Arrays.arrays;

import java.util.Arrays;

public class passinginfunction {
    //static class passinginfunction {
        public static void main(String[] args) {
            int[] nums = {4, 5, 7, 8};
            System.out.println(Arrays.toString(nums));
            change(nums);
            System.out.println(Arrays.toString(nums));
        }
        static void change(int [] arr){
            arr[0]= 99;

        }
    }
