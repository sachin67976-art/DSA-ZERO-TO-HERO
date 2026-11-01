public class Reverseinarray {
    static void reversearray(int arr[]){
        int n=arr.length;
        int i=0;
        int j =n-1;
        while(i<=j){
            //swap
            int temp =arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
           // i ko aage badhao
            i++;
            //j ko piche lao
            j--;
        }
        //now you array has been reversed
        //print
        for(int k: arr){
            System.out.println(k);
        }
    }

    static void main(String[] args) {
        int arr[] ={1,2,30,4,500};
        reversearray(arr);


    }
}
