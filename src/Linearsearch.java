public class Linearsearch {
    static boolean findtarget(int arr[], int target){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                return true;
            }
        }
        //agar pora array travel ho chuka hai
        //and ek baar bhi target nahi mila
        //ishka mtlb , target is not present in array
        // return false
        return false;
    }
    static void main(String[] args) {
        int arr[] ={1,2,3,4,5,6};
        boolean ans =findtarget(arr,3);
        System.out.println(ans);

    }
}
