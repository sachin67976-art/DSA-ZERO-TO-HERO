public class Perfectnumber {
    static boolean checkperfectnumber(int num){
        int sum =1;
        for(int i=2; i*i<=num; i++){
            if(num % i==0) {
                int firstfactor = i;
                int secondfactor = num / i;
                sum = sum + firstfactor + secondfactor;
            }
            }
            if(sum ==num){
                return true;
            }
            else{
                return false;
            }
        }
        static void main(){
            System.out.println(checkperfectnumber(6));
        }
    }

