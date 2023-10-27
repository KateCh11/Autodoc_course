package lessons.lesson16.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
    static LinkedHashSet<String> mySet = new LinkedHashSet<>();

    public static void main(String[] args) {
        addMethodExample(mySet);
        removeMethodExample(mySet, "Alex");
        containsMethodExample(mySet, "Igor");
        containsMethodExample(mySet, "Elena");
        sizeMethodExample(mySet);
        clearMethodExample(mySet);
        isemptyMethodExample(mySet);


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
}
