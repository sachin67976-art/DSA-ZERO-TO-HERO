import java.util.Scanner;

public class Raj {
    public static void main(String[] args) {

        System.out.println("Raj please enter the age :-");

        Scanner sc = new Scanner(System.in);
        int raj = sc.nextInt();

        if (raj >= 90) {
            System.out.println("Raj will be over");
        }
        else if (raj >= 60) {
            System.out.println("Raj ek iPhone lega");
        }
        else if (raj >= 50) {
            System.out.println("Raj ka job hoga");
        }
        else if (raj >= 20) {
            System.out.println("Raj ka second baccha hoga");
        }
        else if (raj >= 19) {
            System.out.println("Raj ka ek baccha hoga");
        }
        else if (raj >= 18) {
            System.out.println("Raj ki marriage hogi");
        }
        else {
            System.out.println("Raj ki marriage nahi hogi");
        }

        sc.close();
    }
}