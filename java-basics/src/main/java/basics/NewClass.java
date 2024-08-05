package basics;

public class NewClass {

    public static int BinarySearch(int[] arr, int low, int high, int n){

        int output = -1;
        int mid = (high + low)/2;
        if (low <= high) {
            if (arr[mid] == n) {
                output = mid;
                return mid;
            } else if (arr[mid] > n) {
                return BinarySearch(arr, low, mid - 1, n);
            } else {
                return BinarySearch(arr, mid + 1, high, n);
            }
        }
        return output;
    }

    public static void main(String[] args){

        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        int output = BinarySearch(arr, 0, arr.length - 1, 1);

        if (output == -1){
            System.out.println("Element is not present in the array");
        } else {
            System.out.println("Element is present in the array at position" + output);
        }
    }
}
