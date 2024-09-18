package Function;

public class product {
    public static int multiply(int a , int b) {
        int product = a * b;
        return product;
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 3;
        int prod = multiply(a,b);
        System.out.println("a * b = " + prod);
        int product = multiply(12,8);
        System.out.println("a * b = " + product);
    }
    }
