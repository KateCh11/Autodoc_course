package homeworks.hw5;

public class ArrayOfStars {
    public static void main(String[] args) {
        arrStar();
    }

    public static void arrStar() {
        String[][] arrayOfStars = new String[3][4];
        //заполнение массива
        for (int i = 0; i < arrayOfStars.length; i++) {
            for (int j = 0; j < arrayOfStars[i].length; j++) {
                arrayOfStars[i][j] = "*";
            }
        }
        //распечатка массива
        for (int i = 0; i < arrayOfStars.length; i++) {
            for (int j = 0; j < arrayOfStars[i].length; j++) {
                System.out.print(arrayOfStars[i][j] + " ");
            }
            System.out.println();
        }
    }
}
