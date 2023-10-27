package lessons.lesson6;

import java.util.Arrays;

/*По очереди меняем местами противоположные элементы массива, используя как посредника
дополнительную переменную String temp (temp - от temporary, «временный").
n-i-1 это формула для определения "противоположного" элемента массива
*/

public class ArrayReverse {
    public static void main(String[] args) {
        //arrRev();
        System.out.println(arrRev2());
    }

    public static void arrRev(){
        String[] arr = {"каждый", "охотник", "желает", "знать", "где", "сидит", "фазан"};
        int arrLen = arr.length;

        String temp;

        //System.out.println(arr.length/2);
        for(int i=0; i<arr.length/2; i++){ //3 итерации
            temp = arr[arrLen - i - 1]; //temp = arr[6] = фазан
            arr[arrLen - i - 1] = arr[i];//arr[6] = arr[0] = каждый
            arr[i] = temp; //arr[0] = temp
        }

        //распечатка for
        for (int i = 0; i < arrLen; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        //распечатка for each
        for (String s : arr){
            System.out.print(s + " ");
        }

        //Arrays.deepToString(arr);
    }


    public static String arrRev2(){
        String[] arr = {"каждый", "охотник", "желает", "знать", "где", "сидит", "фазан"};
        int arrLen = arr.length;

        String temp;

        //System.out.println(arr.length/2);
        for(int i=0; i<arr.length/2; i++){ //3 итерации
              //System.out.println("i= " + i);
            temp = arr[arrLen - i - 1]; //temp = arr[6] = фазан
            System.out.println("temp= " + temp);
            arr[arrLen - i - 1] = arr[i];//arr[6] = arr[0] = каждый
                 System.out.println("arr[" + (arrLen - i - 1) + "]= " + arr[i]);
            arr[i] = temp; //arr[0] = temp
            System.out.println("arr["+ i + "]=" + temp);
            System.out.println();
        }

      return Arrays.deepToString(arr);
    }

}
