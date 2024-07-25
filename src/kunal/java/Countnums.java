package kunal.java;

public class Countnums {
    public static void main(String[] args) {
        int n=4553365;

        int count = 0;
        while (n > 0){
            int rem = n % 10;
            if(rem == 3) {
                count++;
            }
            n=n/10;   // n/=10
            }
        System.out.println(count);
        }
    }
