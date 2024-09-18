package ArrayDSA;

public class Largestvalue {
    public static  int getlargest(int number[]){
        int largest = Integer.MIN_VALUE; // -infifnity
        for(int i= 0; i<number.length; i++){
            if(largest < number[i]){
                largest = number[i];
            }
        }
        return largest;

    }
    public static void main(String[] args) {
        int number[] = {1,2,6,3,5};
        System.out.println("largest value is: " + getlargest(number));
    }
}
