package kunal.java;

import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        Scanner Sc= new Scanner(System.in);
//        String fruit = Sc.next();
//
//        switch (fruit) {
//            case "Mango" -> System.out.println("fruit is the king of mango");
//            case "Apple" -> System.out.println("Apple is a red");
//            case "banana" -> System.out.println("banana is the best fruit of health");
//            case "Grapes" -> System.out.println("Grapes is the small fruit ");
//            default -> System.out.println("please enter a valid a fruit");

        int day = Sc.nextInt();

        switch(day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("wednesday");
            case 4 -> System.out.println("Thurusday");
            case 5 -> System.out.println("friday");
            case 6 -> System.out.println("saturday");
            case 7 -> System.out.println("friday");
            case 8 -> System.out.println("sunday");
        }
            switch (day) {
                case 1, 2, 3, 4, 5 -> System.out.println("weekday");
                case 6, 7 -> System.out.println("weekend");
            }
        }
    }

