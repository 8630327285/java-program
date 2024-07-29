package Function;

public class overloading {
    public static void main(String[] args) {
        fun("nitin");   // basically these is a number can describe the fun int num according to a you
        fun(45);
    }
    static void fun(int a){
            System.out.println(a);
        }


    static void fun(String name){
        System.out.println(name);
    }
}
