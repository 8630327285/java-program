package practice.java;

import java.util.Scanner;

public class taxCalculator {
    public static void main(String[] args) {
       Scanner Sc = new Scanner(System.in);
       int income = Sc.nextInt();
       int tax;

       if (income < 500000) {
           tax = 0;
       }
       else if (income >= 500000 && income < 1000000) {

           tax = (int)(income * 0.2);
       }

       else {
           tax = (int) (income * 0.3);
       }
        System.out.println("your tax is: " + tax);
       }

    }

//        int income = sc.nextInt();
//        int tax;
//
//        if (income < 50000) {
//            tax = 0;
//        }
//        else if (income >= 50000 && income < 500000) {
//            tax = (int) (income * 0.1);  // Assuming a 10% tax for income in this range
//        }
//        else if (income >= 500000 && income < 1000000) {
//            tax = (int) (income * 0.2);
//        }
//        else {
//            tax = (int) (income * 0.3);
//        }
//
//        System.out.println("Your tax is: " + tax);
//        sc.close();  // Good practice to close the scanner
//    }
//}

