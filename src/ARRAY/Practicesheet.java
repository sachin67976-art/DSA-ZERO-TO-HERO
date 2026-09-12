
package ARRAY;
import java.util.Scanner;


public class Practicesheet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter"+n+"element");
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
            for(int i=0; i<n; i++){
                System.out.println(arr[i]+"");
        }

    }
}