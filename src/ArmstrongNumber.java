import java.util.Scanner;

public class ArmstrongNumber {

    public static boolean checkArmstrong(int num){
        int count = 0;
        int temp = num;

        while(temp != 0){
            count++;
            temp = temp / 10;
        }

        temp = num;

        double sum = 0;

        while(temp != 0){
            int digit = temp % 10;
            sum = sum + Math.pow(digit, count);
            temp = temp /10;
        }

        return sum == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value: ");
        int num = sc.nextInt();

        for(int i = 1;i<=num;i++){
            if(checkArmstrong(i)){
                System.out.print(i + " ");
            }
        }

        // boolean result = checkArmstrong(num);



        // if(result){
        //     System.out.println("It is Armstrong");
        // }else{
        //     System.out.println("Not an Armstrong");
        // }
    }
}