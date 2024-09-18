package practice.java;

import java.util.Scanner;

public class Areaofsquare {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int side = sc.nextInt();
        int area = side *side;
        System.out.println("area of the square is: " + area);

    }
}
