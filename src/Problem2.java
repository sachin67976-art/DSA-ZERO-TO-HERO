import java.util.ArrayList;
import java.util.Collections;



public class Problem2 {
    static void reverseList(ArrayList<Integer> list) {

        int i = 0;
        int j = list.size() - 1;

        while (i < j) {

            // Swap elements
            Integer temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);

            i++;
            j--;
        }
}
public static void main(String[] args){
    ArrayList<Integer>list =new ArrayList<>();
    list.add(0);
    list.add(10);
    list.add(3);
    list.add(5);
    list.add(22);
    list.add(10);
    System.out.println("Original list "+ list);
    Collections.reverse(list);
    System.out.println("Reverse list" + list);
    System.out.println("Ascending order"+ list);

    }
}