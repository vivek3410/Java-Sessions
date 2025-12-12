package Practice.Arrays;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static int[] arrayInput(){
        System.out.print("Enter the size: ");
        int size = sc.nextInt();

        int[] nums = new int[size];

        for(int i = 0;i<nums.length;i++){
            System.out.print("Enter the element in index "+ (i+1) + ": ");
            nums[i] = sc.nextInt();
        }

        return nums;
    }

    public static void printArray(int nums[]){
        for(int i = 0;i<nums.length;i++){
            System.out.print(nums[i] + " ");
        }

        System.out.println();
    }
    
}
