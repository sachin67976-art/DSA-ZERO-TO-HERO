import java.util.ArrayList;

public class Wrapperclass {
    public static void main(String[] args) {

        // Wrapper classes
        Integer i = Integer.valueOf(4);
        System.out.println(i);

        Float f = Float.valueOf(4.5f);
        System.out.println(f);

        // ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        // Add new elements
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        // Add element at index 1
        list.add(1, 15);

        // Get an element at index 2
        System.out.println("Element at index 2: " + list.get(2));

        // Print with for loop
        System.out.println("Using for loop:");
        for (int j = 0; j < list.size(); j++) {
            System.out.println(list.get(j));
        }

        // Printing ArrayList directly
        System.out.println("ArrayList: " + list);
    }
}