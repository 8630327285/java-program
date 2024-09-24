package ArrayDSA;

public class MaxsumArray {
    public static void maxSubArray(int number[]){
        int currsum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i<number.length; i++){
            int start = i;
            for(int j=i; j<number.length; j++){
                int end = j;
                currsum = 0;
                for(int k =start; k<end; k++){
                    currsum += number[k];
                }
                System.out.println(currsum);
                if(maxSum < currsum){
                    maxSum = currsum;
                }
            }
        }
        System.out.println("maxSum = " + maxSum);
    }
    public static void main(String[] args) {
        int number[] = {1,-2,6,1,3};
        maxSubArray(number);

    }
}
