
public class Reverse {

    static int reverseNum(int num) {
        int reverse = 0;

        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        return reverse;
    }

    public static void main(String[] args) {
        int num = 1234;
        int result = reverseNum(num);

        System.out.println(result);
    }
}
