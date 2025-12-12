package Arrays.Searching;

public class LinearSearch {

    // TC: o(n)
    public static int search(int arr[],int target){
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {4,2,1,6,8,10};

        int target = 10;

        int result = search(arr, target);

        if(result == -1){
            System.out.println("Element is not found");
        }else{
            System.out.println("Element found at index: " + result);
        }
    }
}
