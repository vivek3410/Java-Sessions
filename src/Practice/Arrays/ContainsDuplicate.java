package Practice.Arrays;

import java.util.HashSet;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums){
        HashSet<Integer> set = new HashSet<>();

        for(int num:nums){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }

        return false;
    }
    

    public static void main(String[] args) {
        int[] nums = Main.arrayInput();

        if(containsDuplicate(nums)){
            System.out.println("Contains Duplicate Values");
        }else{
            System.out.println("Contains Unique Values");
        }
    }
}
