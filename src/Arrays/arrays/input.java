package Arrays.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] str = new String[5];
        for(int i = 0; i< str.length; i++) {
            str[i] = sc.next();
        }
        System.out.println(Arrays.toString(str));

//        int[] num = new int[8];
//
//        for (int i = 0; i < num.length; i++) {
//            num[i] = sc.nextInt(); // Use nextInt() to input an integer
//        }
//
//        System.out.println(Arrays.toString(num)); // Print the array
    }
}


