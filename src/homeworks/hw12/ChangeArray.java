package homeworks.hw12;
/*Дано : int []a = {1, 2, 3, 4, 5, 6};

Написать метод, который будет принимать два параметра:
1.Массив данных
2.Число

Метод должен добавлять в конец принимаемого массива число из параметров
и возвращать изменённый массив!
Без использования метода Arrays.copyOf и подобных!*/

public class ChangeArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int num = 100;
        addToArray(arr, num);
    }

    public static int[] addToArray(int[] arr, int num) {
        int[] newArr = new int[arr.length + 1];

        for (int i = 0; i < newArr.length; i++) { //цикл
            if (i < arr.length) { //перебираю довжину масиву початкового
                newArr[i] = arr[i];
            } else {              //в else потрапляє єдиний елемент (останній)
                newArr[i] = num;
            }
        }


        //роздруковка
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }

        return newArr;
    }
}
