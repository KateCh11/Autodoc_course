package lessons.Lesson16.set;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {


    public static void main(String[] args) {
        SortedSet<String> mySortedSet = new TreeSet<>();
        mySortedSet.add("K");
        mySortedSet.add("A");
        mySortedSet.add("C");
        mySortedSet.add("B");
        mySortedSet.add("1");
        mySortedSet.add("2");
        mySortedSet.add("123");
        mySortedSet.add("0");
        System.out.println(mySortedSet);

        SortedSet<Integer> mySortedSet2 = new TreeSet<>();
        mySortedSet2.add(2);
        mySortedSet2.add(123);
        mySortedSet2.add(2);
        mySortedSet2.add(1);
        mySortedSet2.add(123);
        mySortedSet2.add(3);
        mySortedSet2.add(33);
        mySortedSet2.add(8);
        System.out.println(mySortedSet2);

    }
}
