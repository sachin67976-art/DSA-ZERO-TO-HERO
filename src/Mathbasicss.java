public class Mathbasicss {
    static int countdigits(int num) {
        int count=0;
        while(num !=0){
            int digit=num%10;
            count++;
            num=num/10;
        }
        return count;
    }

    static void main(String[] args) {
        int num =5312597;
        int ans =countdigits(num);
        System.out.println(ans);

    }
//    static void printdigits(int num){
//        while(num!=0){
//            int digit = num%10;
//            System.out.println(digit);
//            num=num/10;
//        }
//    }
//    static void main(String[] args) {
//        int num =53127;
//        printdigits(num);

    }

