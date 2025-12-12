package Arrays.TwoDArrays;

import java.util.Scanner;

public class InsertArrayElts {

    public static void insert(int arr[][],int row,int col){

        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<row;i++){
            for(int j = 0;j<col;j++){
                System.out.print("Insert the element at "+i+", "+ j + ": ");
                arr[i][j] = sc.nextInt();
            }
        }
    }

    public static void print(int arr[][],int row,int col){
        for(int i = 0;i<row;i++){
            for(int j = 0;j<col;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int sumOfElt(int arr[][],int row,int col){
        int sum = 0;

        for(int i = 0;i<row;i++){
            for(int j = 0; j<col;j++){
                sum = sum + arr[i][j];
            }
        }

        return sum;
    }

    public static int diagElt(int arr[][],int row,int col){
        int sum = 0;

        for(int i = 0;i<row;i++){
            for(int j = 0; j<col;j++){
                if(i == j){
                    sum = sum + arr[i][j];
                }
            }
        }

        return sum;
    }
    
    

    public static void main(String[] args) {
        int row , col;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of row: ");
        row = sc.nextInt();
        System.out.print("Enter the size of column: ");
        col = sc.nextInt();

        int arr[][] = new int[row][col];

        insert(arr, row, col);

        print(arr, row, col);

        int sumResult = sumOfElt(arr, row, col);

        System.out.println("Sum of Element is: "+sumResult);

        int sumOfDiag = diagElt(arr, row, col);

        System.out.println("Sum of diagonal Element is: "+sumOfDiag);

    }
}
