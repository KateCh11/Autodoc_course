package lessons.lesson6;

public class ClassWraper {
    public static void main(String[] args) {
        int num = parseStringToInt();
        int sum = num + 18;
        System.out.println(num);

    }

    public static int parseStringToInt(){
        String num = "1000";
        int numInteger = Integer.parseInt(num);
        //System.out.println(numInteger);
        return numInteger;
    }

}
