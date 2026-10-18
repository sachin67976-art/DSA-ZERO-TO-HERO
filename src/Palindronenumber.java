public class Palindronenumber {
    static int reversenum(int num) {
        int revnum = 0;
        while (num != 0) {
            int digit = num % 10;
            revnum = revnum * 10 + digit;
            num = num / 10;
        }
        return revnum;
    }

    static boolean ispalindrome(int num) {
        int originalnum = num;
        int reversednum = reversenum(num);
        if (originalnum == reversednum) {
            System.out.println("It is a palindrome");
            return true;
        } else {
            System.out.println("It is not a palindrome");
            return false;
        }
    }
    static void main(){
        boolean ans =ispalindrome(1221);
        System.out.println(ans);
    }

}

