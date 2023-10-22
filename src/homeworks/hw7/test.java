package homeworks.hw7;

public class test {
       public static void main(String[] args) {
            bigestNumber();
        }

        public static void bigestNumber() {
           int kol = 8;
            int[] numbers = new int[kol];
            for (int randomDigit = 0; randomDigit < numbers.length; randomDigit++) {
                numbers[randomDigit] = (int) (Math.random() * 100);
                System.out.print(numbers[randomDigit] + " ");
            }
            System.out.println();

            /*for (int randomDigit = 0; randomDigit < numbers.length; randomDigit++) {
                 System.out.println("numbers[" + randomDigit + "]= " + numbers[randomDigit]);
            }*/


            /*
            int topNumber = numbers[0];
            for (int topDigit = 1; topDigit < numbers.length; topDigit++) {
                if (numbers[topDigit] > topNumber) {
                    topNumber = numbers[topDigit];
                }
            }
            System.out.println("Самое большое из 8 число: " + topNumber);
            */
        }
    }
