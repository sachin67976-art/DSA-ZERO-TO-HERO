public class Minimumvalue {
    static void main(String[] args) {
        int arr[]={11,2,3,4,-5,6,7,8,9};
        int n=arr.length;
        int minvalue=arr[0];
        for(int i=0; i<=n-1; i++){
            if(arr[i]<minvalue){
                minvalue=arr[i];
            }
        }
        System.out.println(minvalue);
    }
}
