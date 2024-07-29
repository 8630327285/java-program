package Function;

import java.util.Arrays;


public class varArgs {
    public static void main(String[] args) {

  fun(2,7,45,86,85,47);

}
    static void fun(int...v){
    System.out.println(Arrays.toString(v));

}
}
