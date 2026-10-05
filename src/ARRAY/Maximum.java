package ARRAY;

public class Maximum {
    static void main(String[] args) {
        int arr[]={1,200,-22,33,400,-500};
        int n=arr.length;
        int maxvalue =arr[0];
        for(int i=0; i<=n-1; i++){
            if(arr[i]>maxvalue){
                maxvalue=arr[i];
            }


        }
        System.out.println(maxvalue);
    }

}
