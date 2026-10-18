public class Gcdnumber {
    static int getGCD(int a, int b){
        //gcd(a,b) =gcd(b, a%b){
        while(b !=0){
            int olfvalueofb =b;
            b =a%b;
            a =olfvalueofb;

        }
        //jab mera b 0 hoga tab a ki place pr gcd milega
    int ans =a;
        return ans;
    }
    static void main(){
        System.out.println(getGCD(12,18));
    }


}
