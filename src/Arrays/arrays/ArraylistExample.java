package Arrays.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistExample {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(5);
                list.add(45);
                list.add(42);
                list.add(48);
                list.add(47);
                list.add(49);
     //   System.out.println(list.contains(1));
       // System.out.println(list);
       // list.set(0,12);
        System.out.println(list);
        list.remove(2);


    }
}
