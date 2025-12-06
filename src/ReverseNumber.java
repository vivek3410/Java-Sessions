import java.util.Scanner;

public class ReverseNumber {

    public static int reverse(int num){
        int rev = 0;

        while(num != 0){
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }

        return rev;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int result = reverse(num);

        System.out.println("Reversed Number: "+result);
    }
}
