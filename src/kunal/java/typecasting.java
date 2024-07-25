package kunal.java;

import java.util.Scanner;

public class typecasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      //  float num = sc.nextFloat();
      //  System.out.println(num);

//       these is a typecasting
        int num = (int)(56.25);
        System.out.println(num);


        // automatic type promation expression
        int a = 257;      // 257 is % 256 = 1
        byte b = (byte) (a);
        System.out.println(b);


        int number = 'A';
        System.out.println(number);

       // int number = 'A';
     //   System.out.println("नमस्ते");
    }
}
