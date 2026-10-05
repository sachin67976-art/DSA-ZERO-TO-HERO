//print each chracter of the stirng

public class Reversestring {
    static void printString(String str) {
        int n = str.length();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            System.out.println(ch);
        }
    }

    static int getaLengthstring(String str) {
        char[] arr = str.toCharArray();
        int len = arr.length;
        return len;


    }

    static String reverseString(String str) {
        String reverse = " ";
        int n = str.length();
        for (int i = n - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            reverse = reverse + ch;
        }
        return reverse;
    }

    static boolean ispalindrome(String str) {
        String original = str;
        String reverse = reverseString(original);
        for (int i = 0; i < original.length(); i++) {
            char ch1 = original.charAt(i);
            char ch2 = reverse.charAt(i) ;
                if (ch1 != ch2) {
                    return false;
                }
            }

        return true;


}
    static void main(){
        String str ="N00N";
        System.out.println(ispalindrome(str));
        //System.out.println(reverseString(str));
        //
       // System.out.println(getaLengthstring(str));
    }
}
