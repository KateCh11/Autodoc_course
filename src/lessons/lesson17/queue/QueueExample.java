package lessons.lesson17.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    static Queue<Integer> myQueue = new LinkedList<>();

    public static void main(String[] args) {
        addMethod(myQueue);
        showQueue(myQueue);
        pollExample(myQueue);
        removeExample(myQueue, 34);
        offerExample(myQueue, 55);
        peakExample(myQueue);
    }

    static void elementExample(Queue<Integer> queue){
        System.out.println(queue.element());
        showQueue(queue);
    }


    //Вернет верзний элемент и в случае пустого листа не выбрасывает exeption и вернет null
    static void peakExample(Queue<Integer> queue){
        System.out.println(queue.peek());
        showQueue(queue);
    }



    static void offerExample(Queue<Integer> queue, int obj){
        System.out.println("\n" + "Before using offer method");
        showQueue(queue);

        queue.offer(obj); //удалить по значению

        System.out.print("\n" + "After using offer method");

        showQueue(queue);
    }



    static void removeExample(Queue<Integer> queue, int obj){
        System.out.println("\n" + "Before deleting with poll method");
        showQueue(queue);

        queue.remove(obj); //удалить по значению

        System.out.print("\n" + "After deleting with poll method");

        showQueue(queue);
    }



    //удаляет верхний элемент и в случае пустого листа не выбрасывает Exeption
    static void pollExample(Queue<Integer> queue){
        showQueue(queue);

        queue.poll();

        System.out.print("\n" + "After deleting with poll method");

        showQueue(queue);
    }

    static void addMethod (Queue<Integer> queue) {
        queue.add(3);
        queue.add(6);
        queue.add(34);
        queue.add(23);
        queue.add(76);
    }

    static void showQueue (Queue<Integer> queue){
        for (Integer i: queue) {
            System.out.println(" " + i);
        }
    }



}
