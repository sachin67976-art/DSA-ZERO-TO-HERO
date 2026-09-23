package ARRAY;

import java.util.ArrayList;

public class Wrapperclass {

    public static void main(String[] args) {

        // =========================
        // Wrapper Classes
        // =========================

        Integer i = Integer.valueOf(4);
        System.out.println(i);

        Float f = Float.valueOf(4.5f);
        System.out.println(f);


        // =========================
        // ArrayList
        // =========================

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Boolean> list2 = new ArrayList<>();
        ArrayList<Float> list3 = new ArrayList<>();

        // Adding elements
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("Original ArrayList: " + list);


        // Adding element at index 1
        list.add(1, 15);
        System.out.println("After adding 15 at index 1: " + list);


        // Getting element at index 2
        System.out.println("Element at index 2: " + list.get(2));


        // =========================
        // Print using for loop
        // =========================

        System.out.println("Using for loop:");

        for (int j = 0; j < list.size(); j++) {
            System.out.println(list.get(j));
        }


        // Printing ArrayList directly
        System.out.println("ArrayList: " + list);


        // =========================
        // Set / Modify element
        // =========================

        list.set(1, 100);
        System.out.println("After modifying index 1: " + list);


        // =========================
        // Remove element by index
        // =========================

        list.remove(1);
        System.out.println("After removing index 1: " + list);


        // =========================
        // Remove element by value
        // =========================

        list.remove(Integer.valueOf(30));
        System.out.println("After removing value 30: " + list);


        // =========================
        // Check if element exists
        // =========================

        boolean ans = list.contains(Integer.valueOf(10));
        System.out.println("Does 10 exist? " + ans);


        // =========================
        // Raw ArrayList
        // =========================

        ArrayList l = new ArrayList();

        l.add("pqres");
        l.add(1);
        l.add(true);

        System.out.println("Raw ArrayList: " + l);
    }
}