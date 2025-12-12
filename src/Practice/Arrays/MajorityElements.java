package Practice.Arrays;

import java.util.HashMap;

public class MajorityElements {

    public static int majorityElements(int nums[]){
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        for(int num:nums){
            map.put(num,map.getOrDefault(num, 0) + 1);

            if(map.get(num) > n/2){
                return num;
            }
        }

        return -1;
    }
    

    public static void main(String[] args) {
        int nums[] = Main.arrayInput();

        int result = majorityElements(nums);

        if(result != -1){
            System.out.println("Majority Element: " + result);
        }else{
            System.out.println("There is no majority element");
        }

    }
}
