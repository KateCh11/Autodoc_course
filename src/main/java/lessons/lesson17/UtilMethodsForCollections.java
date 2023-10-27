package lessons.lesson17;

import java.util.*;

public class UtilMethodsForCollections {
    public static void main(String[] args) {
        //asListMethods();
       // sortMethods();
        //shMethods();
        //minMaxMethods();
        //frMethods();
        frMethods();
    }

    public static void frMethods() {
        List<Integer> colorList = Arrays.asList(12, 45, 1, 34, 6, 8, 2, 34, 1, 1, 89);
        System.out.println(Collections.frequency(colorList, 1));
    }

    public static void minMaxMethods() {
        List<Integer> colorList = Arrays.asList(12, 45, 1, 34, 6, 8,2,34, 89);
        System.out.println(Collections.max(colorList));
        System.out.println(Collections.min(colorList));
    }

    public static void shMethods() {
        List<String> colorList = Arrays.asList("Yellow", "Red", "Blue");
        Collections.shuffle(colorList);
        System.out.println("Collection after shuffle " + colorList);
    }


    public static void sortMethods() {

        List<String> colorList = Arrays.asList("Yellow", "Red", "Blue");
        System.out.println("Collection before sorting " + colorList);

        Collections.sort(colorList);
        System.out.println("Collection after sorting " + colorList);

        colorList.sort(Collections.reverseOrder());
        System.out.println("Collection after reverseOrder " + colorList);

        Collections.reverse(colorList);
        System.out.println("Collection after reverse " + colorList);
    }


    public static void asListMethods() {
        String[] arr = {"foo", "baa", "baz"};
        List<String> list = Arrays.asList();
        System.out.println(list);
    }
}
