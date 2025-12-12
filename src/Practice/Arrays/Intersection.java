package Practice.Arrays;

import java.util.HashSet;

public class Intersection {

    public static int[] intersectionOfTwoArrays(int nums1[],int nums2[]){

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();

        for(int num:nums1){
            set1.add(num);
        }

        for(int num:nums2){
            if(set1.contains(num)){
                result.add(num);
            }
        }

        int[] output = new int[result.size()];
        int i = 0;
        for(int num:result){
            output[i++] = num;
        }

        return output;
    }
    

    public static void main(String[] args) {
        int[] nums1 = Main.arrayInput();
        int[] nums2 = Main.arrayInput();

        int[] result = intersectionOfTwoArrays(nums1, nums2);

        Main.printArray(result);

    }
}
