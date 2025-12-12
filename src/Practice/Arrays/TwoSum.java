package Practice.Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum{

    public static int[] twoSumTwoPointers(int nums[],int target){
        int left = 0;
        int right = nums.length - 1;

        while(left < right){
            int sum = nums[left] + nums[right];

            if(target == sum){
                return new int[]{left,right};
            }

            if(sum < target){
                left++;
            }else{
                right--;
            }
        }

        return new int[]{};
    }

    public static int[] twoSumHashMap(int nums[],int target){
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0;i<nums.length;i++){
            int complement = target - nums[i];

            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }

            map.put(nums[i], i);
        }

        return new int[]{};
    }

    public static void main(String[] args) {
        int nums[] = Main.arrayInput();
        System.out.print("Enter the target: ");
        int target = Main.sc.nextInt();

        // int[] result = twoSumHashMap(nums, target);

        Arrays.sort(nums);
        int[] result = twoSumHashMap(nums, target);
 
        Main.printArray(result);
    }
}