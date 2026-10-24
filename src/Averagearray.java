public class Averagearray {
    static double getaverage(int[] arr){
        double sum=0;
        for(int i:arr) {
            sum += i;
        }
        int size =arr.length;
        double avg =sum /size;
        return avg;
        }
        static void main(){
        int [] arr={2,7,3,3};
            System.out.println(getaverage(arr));
    }
}
