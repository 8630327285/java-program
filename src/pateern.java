import java.sql.SQLOutput;

public class pateern {
    public static void main(String[] args) {
//        System.out.println("* * * * *");
//        System.out.println("       *");
//        System.out.println("     *");
//        System.out.println("    *");
//        System.out.println(" *");
//        System.out.println("* * * * *");


        //n-i+1


//        for(int i=1; i<=4; i++){
//            for(int j=1; j<=4-i+1; j++){
//                System.out.print("*");
//            }
//            System.out.println();

        //print number
//        for(int n =1; n<=4; n++){
//            for(int j=1; j<=n; j++){
//                System.out.print(j);
//
//            }
//            System.out.println();

            //print character
            int n = 4;
            char ch = 'A';
            for(int i=1; i<=4; i++){
                for(int chars=1; chars<=i; chars++) {
                    System.out.print(ch);
                    ch++;
                }
                System.out.println();
                }
            }
    }
