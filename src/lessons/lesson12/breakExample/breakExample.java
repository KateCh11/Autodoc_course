package lessons.lesson12.breakExample;

public class breakExample {

    public static void main(String[] args) {
        breakForInnerLoop();
    }


    public static void breakForInnerLoop() {
        outer:
        for (int i = 0; i <= 3; i++) {
            System.out.println("Я первый цикл и выполняюсь " + i + " раз");
            for (int a = 0; a <= 5; a++) {
                System.out.println("Я второй внутренний цикл и выполняюсь " + a + " раз");
                if (a == 2){
                    break outer;
                }
            }
        }
    }

    public static void breakForWhile() {
        int a = 3;
        int i = 1;
        while (i <= 1) {
            System.out.println("Цикл выполняется " + i + " раз");
            if (i == a) {
                break;
            }
            i++;
        }
    }


}



