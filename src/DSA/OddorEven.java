package DSA;

public class OddorEven {
    public static void oddoreven(int n) {
        int bitmask = 1;
        if((n & bitmask) == 0){
        //even number
        System.out.println("even number");
    }else

    {
        System.out.println("odd number");
    }
}
    public static void main(String[] args) {
        oddoreven(33);
        oddoreven(2);


    }
}
