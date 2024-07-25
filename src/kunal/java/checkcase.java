package kunal.java;

import java.util.Scanner;

public class checkcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().trim().charAt(0);

        if (ch >= 'a' && ch <='b')
            System.out.println("Lower case");
        else{
            System.out.println("uppercase");
        }
//        System.out.println(ch);
    }
}
