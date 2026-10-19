
public class Armstrongnumber {

    static boolean isarmstronngnumber(int num) {
        int originalnum = num;
        int sum = 0;

        while (num != 0) {
            int digit = num % 10;
            int cubeofdigit = digit * digit * digit;
            sum = sum + cubeofdigit;
            num = num / 10;
        }

        if (sum == originalnum) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isarmstronngnumber(153));
    }
}
