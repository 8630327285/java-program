package practice.java;

public class reverse {
    public static void main(String[] args) {
        int n = 123456;

        while(n>0){
            int lastDigit = n % 10;
            System.out.print(lastDigit);
            n=n/10;
            System.out.println();

        }
    }
}
