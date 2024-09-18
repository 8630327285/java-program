package Arrays.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Mutidal {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // intialisation
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        //odd elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(Sc.nextInt());
            }
        }
        System.out.println(list);
    }
}
