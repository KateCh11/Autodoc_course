package homeworks.hw9;

/*Написать программу, которая будет заменять все четные элементы массива на Y
и выводить результат в консоль!
      //Массив от 1 до 10!*/
public class ArrayEven {
    public static void main(String[] args) {

        //СПОСОБ 1
       /* int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        String[] arrStr = new String[10];
        String arrNew = "Y";

        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] % 2) == 0) {
                arrStr[i] = arrNew;
            } else
                arrStr[i] = String.valueOf(arr[i]);//преобразует объект в строковый вид
        }

        //распечатываем массив
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arrStr[i]);
        }
        */

        //СПОСОБ 2
        String[] array = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10" };

        for (int i = 0; i < array.length; i++) {
            int number = Integer.parseInt(array[i]);
            if (number % 2 == 0) {
                array[i] = "Y";
            }
        }

        for (String str : array) {
            System.out.println(str);
        }
    }

}
