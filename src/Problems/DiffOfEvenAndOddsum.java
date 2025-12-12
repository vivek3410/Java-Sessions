package Problems;

import java.util.Scanner;

public class DiffOfEvenAndOddsum {

    public static int solution(int n){
        int evenSum = 0,oddSum = 0;
        // 1234 

        while(n > 0){
            int digit = n % 10;

            if(digit % 2 == 0){
                evenSum += digit;
            }else{
                oddSum += digit;
            }

            n = n / 10;
        }

        if(evenSum < oddSum){
            return oddSum - evenSum;
        }else{
            return evenSum - oddSum;
        }
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int result = solution(num);

        System.out.println(result);
    }
}
