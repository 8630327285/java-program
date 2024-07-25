package kunal.java;

import java.util.Scanner;

public class forloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        syntax of for loop;
        for (intialization; condition; increament/decreament){
        // body
        }
        //  Ques: print the numbers from 1 to 5

         */
//        for (int num = 1; num <= 5; num += 1) {
//            System.out.println(num);
//        }

        // print number from 1 to n
        Scanner in = new Scanner(System.in);
      //  int n = in.nextInt();
//        for (int num = 1; num <= n; num++) {
//           // System.out.println(num + " ");
//            System.out.println("Hello world");
//        }

        // while loop
        /*
        syantax
        while (conditonal) {
        //body
        }
         */
        int num  = 1;
        while (num<=5){
 //           System.out.println(num);
            num +=1;

        }
        //do while
        /*
        do {
        }while(conditional);
         */

        int n =1;
        do {
            System.out.println("Hello");
            n++;
        }while (n <=5);


        }

    }
