package homeworks.hw4;

public class MultTable {
    public static void main(String[] args) {
        //table();
        line();
    }

    public static void table() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("3*" + i + "= " + 3 * i);
        }
    }

    public static void line() {
        int i = 1;
        do {
            System.out.print(i + " ");
            i *= 2;
        } while (i <= 512);
    }

}
