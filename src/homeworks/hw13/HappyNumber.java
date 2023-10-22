package homeworks.hw13;

/*Необходимо написать программу «Счастливое число».

Давайте представим, что у нас есть промежуток из 10 чисел, счастливым числом будет являться 3!
Нужно написать программу, которая ищет счастливое число!
Программа перебирает числа по одному, и когда доходит до 3-го числа — 
напишет "Вот счастливое число!" и выходит из цикла.
При разработке необходимо использовать цикл и условный оператор!*/

public class HappyNumber {
    public static void main(String[] args) {
        happyNumber();
    }

    public static int happyNumber() {
        for (int i = 1; i <= 10; i++) {
            if (i == 3) {
                System.out.println("This is happy number " + i);
                break;
                //continue;
            }
        }
        return 0;
    }
}
