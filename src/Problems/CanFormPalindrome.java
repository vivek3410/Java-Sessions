package Problems;

import java.util.HashMap;
import java.util.Scanner;

public class CanFormPalindrome {

    public static boolean solution(String str){
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c : str.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int oddCount = 0;

        for(int val : map.values()){
            if(val % 2 == 1){
                oddCount++;
            }
            
            if(oddCount > 1){
                return false;
            }
        }

        return oddCount <= 1;
    }
    

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        boolean result = solution(str);
        System.out.println(result);
        if(result){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
