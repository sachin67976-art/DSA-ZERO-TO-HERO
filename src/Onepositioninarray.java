public class Onepositioninarray {
    static void shiftby1(int[] arr){
        //step1: store last wale ki value
        int n =arr.length;
        int temp =arr[n-1];
        //step2: shift all value of array
        for(int i=n-1; i>0; i--){
            arr[i] =arr[i-1];
        }
        arr[0] =temp;
    }
    //step3: temp ki value ko 0 index pr copy
    static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        shiftby1(arr);
        for(int a:arr){
            System.out.print(a + " ");
        }
        System.out.println();
    }
}
