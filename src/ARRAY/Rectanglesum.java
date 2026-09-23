package ARRAY;

import java.util.Scanner;
public class Rectanglesum {
    static int findsum(int[][] matrix, int l1, int r1, int l2, int r2){
        int sum =0;
        for(int i =l1; i<=l2; i++){
            for(int j =r1; j<=r2; j++){
                sum+= matrix[i][j];
            }
        }
        return sum;
    }

     public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
         System.out.println("Enter number of rows and columns");
         int r =sc.nextInt();
         int c =sc.nextInt();
         int [][] matrix =new int[r][c];
         int totalelements =r*c;
         System.out.println("Enter" + totalelements + "values");
         for(int i=0; i<r; i++){
             for(int j=0; j<c; j++){
                 matrix[i][j]=sc.nextInt();

             }
         }
         System.out.println("Enter rectangle boundaries l1, r1 ,l2, r2");
         int l1 =sc.nextInt();
         int r1 =sc.nextInt();
         int l2 =sc.nextInt();
         int r2 =sc.nextInt();

         System.out.println("Rectangle sum " + findsum(matrix ,l1, r1, l2, r2));

    }
}
