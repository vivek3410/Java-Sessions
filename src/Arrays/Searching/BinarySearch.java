package Arrays.Searching;

import java.util.Arrays;

public class BinarySearch {

    // TC: o(n)
    public static int search(int arr[],int target){
        int left = 0;
        int right = arr.length - 1;

        while(left <= right){
            int mid = left + (right - left) / 2; // Overflow condition

            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }

        return -1;
    }
    

    public static void main(String[] args) {
        int arr[] = {4,2,1,6,8,10};

        Arrays.sort(arr);

        int target = 10;

        int result = search(arr, target);

        if(result == -1){
            System.out.println("Element is not found");
        }else{
            System.out.println("Element found at index: " + result);
        }
    }
}
