package kunal.java;
import java.util.*;

public class factorial {
    public static int fac(int n) {
        if (n == 0) return 1;
        return n * fac(n - 1);
    }
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int fact = 1;
//        int n = sc.nextInt();
//        for (int i = n; i >= 1; i--) {
//            fact = fact * i;
//        }
//        System.out.println(fact);

//       int n = 5;
        System.out.println(fac(5));





    }
}

