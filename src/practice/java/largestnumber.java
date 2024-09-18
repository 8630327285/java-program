package practice.java;

public class largestnumber {
    public static void main(String[] args) {
        int a = 3, b = 4, c =8;
        if ((a >= b) && (a >= c)) {
            System.out.println("largest is a");
        }
        else if(b>=c) {
            System.out.println("largest is b");
        }
        else{
            System.out.println("largest is c");
        }
    }
}
