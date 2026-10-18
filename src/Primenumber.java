public class Primenumber {
    static boolean isprimeornot(int num){
        for(int i=2; i<=num-1;i++){
            if(num%i ==0){
                //not a prime
                return false;
            }
        }
        //yaha tabhi pouch payega jab loop se bahar nikloge
        //or loop se tabhi bahar nikaloge , jab kabhi bhi
        //reminder me zero naa aayega
        //or agar kahi reminder  0 nahi aaya
        //iska mtalab its a prime number
        //
        return true;
    }
    static void main(){
        int num =14;
        System.out.println(isprimeornot(num));
    }
}
