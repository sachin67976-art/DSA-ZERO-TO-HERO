public class Mathbasicss {
    static void printdigits(int num){
        while(num!=0){
            int digit = num%10;
            System.out.println(digit);
            num=num/10;
        }
    }
    static void main(String[] args) {
        int num =53127;
        printdigits(num);

    }
}
