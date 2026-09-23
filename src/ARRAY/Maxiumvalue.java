package ARRAY;

public class Maxiumvalue {
    public static void main(String[] args) {


        int[] arr = {10, 20, 30, 40};
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>ans){
                ans=arr[i];
                System.out.println("max="+ans);
            }

        }
    }
}