
public class Multiplayinarray {

    static int[] multiplyby10(int arr[]) {
        int size = arr.length;
        int newarray[] = new int[size];

        for (int i = 0; i < size; i++) {
            int element = arr[i];
            int newelement = element * 10;
            newarray[i] = newelement;
        }

        return newarray;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};

        int ans[] = multiplyby10(arr);

        System.out.println("Printing answer array:");

        for (int i : ans) {
            System.out.println(i);
        }
    }
}
