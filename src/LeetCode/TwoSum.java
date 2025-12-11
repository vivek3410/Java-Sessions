package LeetCode;

import java.util.HashMap;

// {2,7,10,14} array 
// target = 9;

public class TwoSum {

    public static int[] solution(int[] nums,int target){
        // TC: o(n^2)
        for(int i = 0;i<nums.length;i++){
            for(int j = i + 1;i<nums.length-1;i++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }

        return new int[]{};
    }


    public static int[] twoSumHashMap(int[] nums,int target){

        HashMap<Integer,Integer> map = new HashMap<>();
        // a + b = target
        // a = target - b

        // TC: o(n)
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
        int nums[] = {2,7,10,14};
        int target = 9;

        int[] result = twoSumHashMap(nums, target);

        for(int elt:result){
            System.out.print(nums[elt] + " ");
        }

        // int[] brutResult = solution(nums,target);
       
        System.out.println();

    }
}
