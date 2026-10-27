public class Positivesum {
    static int [] getposnegsum(int arr[]){
        int possum =0;
        int negsum =0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>0){
                // num is positive
                possum =possum+arr[i];

            }
            else{
                //num is negative
                negsum =negsum+arr[i];
            }
        }
        int ans[]={possum, negsum};
        return ans;
    }
    static void main(String[] args) {
        int arr[]={1,2,-3,4,5,6,-7,8,-9};
        int ans[]=getposnegsum(arr);
        System.out.println("positive sum =" + ans[0]);
        System.out.println("negative sum =" + ans[1]);
    }
}
