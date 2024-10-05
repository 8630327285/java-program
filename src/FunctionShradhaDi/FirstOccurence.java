package FunctionShradhaDi;

public class FirstOccurence {
    public static int firstOccurence(int arr[], int key, int i){
        if(i == arr.length){
            return -i;
        }
        if(arr[i] == key){
            return i;

        }
        return firstOccurence(arr,key,i+1);

    }

    public static void main(String[] args) {
        int arr[] = {8,5,4,6,4,5,4};
        System.out.println(firstOccurence( arr,5,0));


    }
}
