public class Unsortedelement {
    static int getunsortedelement(int arr []){
        for(int i=0; i<arr.length; i++){
            if(arr[i+1]<= arr[i]){
                return arr[i+1];
            }
        }
        //jis kaise me mainn loop  se bahar ajaunga
        return -1;

    }
    static void main(String[] args) {
        int arr[] ={1,2,3,4,5,9,8};
        System.out.println(getunsortedelement(arr));

    }
}
