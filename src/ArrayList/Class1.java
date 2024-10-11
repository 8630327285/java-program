package ArrayList;

import java.util.ArrayList;

public class Class1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

        // operations
        //Get elements
//        int element=list.get(2);
//        System.out.println(element);



        // Remove Elements
//        list.remove(2);
//        System.out.println(list);


        //set element at index
//        list.set(0,10);
//        System.out.println(list);


        //Contains Element
        System.out.println(list.contains(1));
        System.out.println(list.contains(2));





     }
}
