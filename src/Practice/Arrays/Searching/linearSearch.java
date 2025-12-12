package Practice.Arrays.Searching;

public class linearSearch {

    public static int search(int arr[],int target){

        for(int i = 0;i<arr.length;i++){
            if(arr[i] == target){
                return i;
            }
        }

        return -1;
    }
    

    public static void main(String[] args) {
        int arr[] = {1,2,4,5,6};

        int isPresent = search(arr, 5);

        if(isPresent != -1){
            System.out.println("Element present at index: " + isPresent);
        }else{
            System.out.println("Element not fouund");
        }
    }
}
