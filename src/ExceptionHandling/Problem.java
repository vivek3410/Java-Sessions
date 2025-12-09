package ExceptionHandling;

import java.io.IOException;

public class Problem {
    public static void print() throws Exception{
        int num = 50;
        try {
            int result = num / 0;
            System.out.println(result);
            throw new IOException("Error");
        }catch(ArithmeticException e) {
            throw new ArithmeticException("error1");
        }
        catch(Exception e){
            throw new Exception("Cant be divided by 0");
        }
    }


    public static void main(String[] args) {
        try{
            print();
            // int arr[] = new int[5];
            // arr[10] = 20;
            // System.out.println(arr[10]);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}