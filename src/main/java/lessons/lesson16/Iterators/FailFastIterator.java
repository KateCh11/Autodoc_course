package lessons.lesson16.Iterators;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastIterator {
    public static void main(String[] args) {
        //List<Integer> myList = new ArrayList<>();
        List<Integer> myList = new CopyOnWriteArrayList<>();
        myList.add(1);
        myList.add(5);
        myList.add(7);
        myList.add(8);
        myList.add(9);
        System.out.println("Before ");

        Iterator<Integer> myIterator = myList.iterator();
        while (myIterator.hasNext()) {
            Integer nextValue = myIterator.next();
            //myIterator.remove();
            //myList.remove(0);
            if (nextValue.equals(5)){
                myList.remove(1);
            }
        }
        System.out.println("After iteration " + myList);
    }
}
