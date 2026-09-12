package ARRAY;

public class Practicesheet {
     public static void main(String[]args) {

         int[] arr ={1,9,5, 20,11};
         int ans=0;
         for(int i =0; i<arr.length; i++) {
             if (arr[i] > ans) {
                 ans = arr[i];
             }
         }
         System.out.println("max: "+ans);



}
}
