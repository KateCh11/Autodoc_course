package lessons.lesson4.loops;

public class Tasks {
    public static void main(String[] args) {
        //taskFor();
        //taskWhile();
        taskWhile2();
    }


    /*Необходимо вывести на экран числа от 5 до 1 с помощью цикла for.
    На экране должно быть: 5 4 3 2 1*/
    public static void taskFor() {
        for (int i = 5; i > 0; i--) {
            System.out.print(i + " ");
        }
    }

    /*Необходимо вывести на экран вот такую последовательность чисел с помощью цикла while:
        100 90 80 70 60 50 40 30 20 10*/
    public static void taskWhile() {
        int start = 100;
        while (start >= 10) {
            System.out.print(" " + start);
            start = start - 10;
        }
    }

    /*Необходимо вывести на экран вот такую последовательность чисел с помощью цикла while:
        7 14 21 28 35 42 49 56 63 70 77 84 91 98*/

    public static void taskWhile2() {
        int i = 7;
        while (i <= 98) {
            System.out.print(" " + i);
            i +=7; //i = i + 7;
        }
    }

}
