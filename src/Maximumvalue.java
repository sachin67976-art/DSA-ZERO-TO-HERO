public class Maximumvalue {
    public static void main(String[]args) {


        int[] num = {1, 100,2, 5};
        int ans = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > ans) {
                ans = num[i];
            }
        }
            System.out.println("max= " + ans);

        }
    }
