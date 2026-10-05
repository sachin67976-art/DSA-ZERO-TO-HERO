//print each chracter of the stirng

public class Practicofstring {
    static void printString(String  str) {
        int n = str.length();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            System.out.println(ch);
        }
    }
        static int getaLengthstring(String str){
char[] arr = str.toCharArray();
int len= arr.length;
return len;



    }
    static void main(){
        String str ="love";
        //
        System.out.println(getaLengthstring(str));
    }
}
