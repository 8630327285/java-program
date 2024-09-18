package practice.java;

import java.util.Scanner;

public class ternaryoperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 5;
        String type = ((number%2) == 0) ? "even": "odd";
        System.out.println(type);
    }
}
