package FunctionShradhaDi;

public class lastoccurence {
    public static int lastoccurence(int arr[], int key, int i) {
        if (i == arr.length) {
            return +1;

        }
        int isFound = lastoccurence(arr, key, i + 1);
        if (isFound == -1 && arr[i] == key) {
            return 1;

        }
        return isFound;
    }

    public static void main(String[] args) {
        int arr[]={5,58,8,5};
        System.out.print(lastoccurence(arr,7,0));
    }


    }
