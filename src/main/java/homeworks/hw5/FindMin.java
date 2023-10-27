package homeworks.hw5;

public class FindMin {
    public static void main(String[] args) {
        System.out.println(minNumber(5,4));
        System.out.println(minNumber(5,6));
        System.out.println(minNumber(7,7));
    }

    public static int minNumber(int num1, int num2){
        int min = num1;
        if (num2 < min){
            min = num2;
        }
        return min;
    }
}
