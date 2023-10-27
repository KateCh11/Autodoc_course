package lessons.lesson4.array;

import java.util.SortedMap;

public class emptyArray {
    public static void main(String[] args) {
        int[] arr = new int [3];
        arr[0] = 5;
        arr[1] = 7;
        arr[2] = 9;

        System.out.println(arr[arr.length-1]);

        //String[] names = new String [10];
        boolean[] names = new boolean[10];
        System.out.println(names[0]);
    }

}
