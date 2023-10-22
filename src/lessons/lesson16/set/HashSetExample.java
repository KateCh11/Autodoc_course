package lessons.lesson16.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetExample {
    static HashSet<String> mySet = new HashSet<>();

    public static void main(String[] args) {
        addMethodExample(mySet);
        removeMethodExample(mySet, "Alex");
        containsMethodExample(mySet, "Igor");
        containsMethodExample(mySet, "Elena");
        sizeMethodExample(mySet);
        clearMethodExample(mySet);
        isemptyMethodExample(mySet);
        howGetSetExample(mySet, 0);


        /*int[] arr = {1, 2, 3, 4, 5};
        System.out.println(arr.length);*/
    }

    static void addMethodExample(Set<String> someset) {
        someset.add("Alex");
        someset.add("Alex");
        someset.add("Max");
        someset.add("Igor");
        System.out.println(someset);

    }

    static void removeMethodExample(Set<String> someset, String removeObj) {
        System.out.println("Before remove");
        System.out.println(someset);
        someset.remove(removeObj);
        System.out.println("After remove");
        System.out.println(someset);


    }

    static void containsMethodExample(Set<String> someset, String containsObg) {
        System.out.println("Set Contains: " + containsObg + " - " + someset.contains(containsObg));
    }

    static void sizeMethodExample(Set<String> someset) {
        System.out.println("Size: " + someset.size());
    }

    static void clearMethodExample(Set<String> someset) {
        System.out.println("Set size before clear: " + someset.size());
        someset.clear();
        System.out.println("Set size before clear: " + someset.size());
    }

    static void isemptyMethodExample(Set<String> someset) {
        System.out.println("Is set empty? " + someset.isEmpty());
        addMethodExample(someset);
        System.out.println("Is set empty? " + someset.isEmpty());
    }

    static void howGetSetExample(Set<String> someset, int element) {
        List<String> myList = new ArrayList<>(someset);
        System.out.println("Get set example " + myList.get(0));
    }

}
