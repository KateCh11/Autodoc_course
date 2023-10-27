package homeworks.hw8;

/**Заполнить массив из 10 элементов случайными целыми числами от 10(включительно)
 * до 20(включительно). Вывести среднее арифметическое.
 */


public class ArrAver {
    public static void main(String[] args) {
        int kol = 10;
        int[] arr = new int[kol];

        for(int i=0; i<arr.length; i++){
            arr[i] = randomNum();
            System.out.println("arr["+ i + "]=" + arr[i]);
        }

        System.out.println();

        System.out.println("Average = " + AverArr(arr));

    }

    public static int randomNum() {
        //(Math.random() * (b-a)) + a;
        //[0;100] (Math.random() * (100-0)) + 0
        int rnum = (int) (Math.random() * (200 + 1) -100);
        return rnum;
    }

    public static double AverArr(int [] arr){
       int sum = arr[0];
        for(int i = 1; i < arr.length; i++){
            sum = sum + arr[i];
        }
        return sum/arr.length;
    }
}
