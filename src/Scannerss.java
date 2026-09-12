import java.util.Scanner;
public class Scannerss {
   public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
       System.out.println("ENTER THE ARRAY  ");
       int n =sc.nextInt();
       int arr[]=new int[n];
       System.out.println("enter" +n+ "element");
       for(int i=0; i<arr.length; i++) {
           arr[i] = sc.nextInt();
       }
       for(int i=0; i<n; i++){
           System.out.println(arr[i]+ "");
       }

    }
}
