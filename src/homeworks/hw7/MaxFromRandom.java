package homeworks.hw7;

/*Написать программу, в которой создаётся целочисленный массив из 8 случайных чисел из диапозона  [0, 100]
 и выводит максимальный элемент массива в консоль.*/

/*(Math.random() * ++max) + min; так будет включая минимальный и максимальный диапазон
public static int rnd(int min, int max)
{
	max -= min;
	return (int) (Math.random() * ++max) + min;
}*/

public class MaxFromRandom {
    public static void main(String[] args) {
        int kolEl = 8; //count of elements in the array
        int[] arr = new int[kolEl];
        //full array with random elements
        for (int i = 0; i < kolEl; i++) {
            arr[i] = randomNum();
        }
        //print array
        for (int i = 0; i < kolEl; i++) {
            System.out.println("arr[" + i + "]= " + arr[i]);
        }
        //print max element
        maxElementInArray(arr);
    }

    public static void maxElementInArray(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("max element = " + max);
    }

    public static int randomNum() {
        //(Math.random() * (b-a)) + a;
        //[0;100] (Math.random() * (100-0)) + 0
        int rnum = (int) (Math.random() * 100);
        return rnum;
    }
}
