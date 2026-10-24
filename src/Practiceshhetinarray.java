public class Practiceshhetinarray {
    static double getaverage(int arr[]){
        double sum =0;
        for(int i: arr){
            sum +=i;
        }
        int size =arr.length;
        double average =sum/size;
        return average;
    }
    static void main(String[] args) {
        int arr []={1,2,3,45};
        System.out.println(getaverage(arr));

    }


    }





