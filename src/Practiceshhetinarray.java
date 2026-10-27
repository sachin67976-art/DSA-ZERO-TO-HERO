public class Practiceshhetinarray {
    static int [] getposnegsum(int arr[]){
        int zero =0;
        int one =0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>0){
                // num is positive
                zero =zero+arr[i];

            }
            else{
                //num is negative
                one =one+arr[i];
            }
        }
        int ans[]={zero, one};
        return ans;
    }
    static void main(String[] args) {
        int arr[]={1,0,0,0,1,1,1,1,};
        int ans[]=getposnegsum(arr);
        System.out.println("zero  =" + ans[0]);
        System.out.println(" one  =" + ans[1]);
    }
}















