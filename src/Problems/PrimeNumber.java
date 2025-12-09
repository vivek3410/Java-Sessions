package Problems;
import java.util.Scanner;

public class PrimeNumber {

    public static boolean isPrime(int num){

        if(num <= 0){
            System.out.println("Number cant be checked");
            return false;
        }

        if(num == 1) return true;

        int count = 2;

        for(int i = 2;i<num / 2;i++){
            if(num % i == 0){
                count++;
                return false;
            }
        }

        return count == 2;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for(int i = 2;i<=num;i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }

        // if(isPrime(num)){
        //     System.out.println("It is Prime");
        // }else{
        //     System.out.println("Not a prime");
        // }
    }
}
