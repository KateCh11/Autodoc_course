package lessons.lesson6;

public class StringMethods {
    public static void main(String[] args) {
        //equalsIgnoreCaseMethod();
        //LastIndexOfMethod();
        ValueOfMethos();
    }

    public static void ValueOfMethos(){
        int num = 5623;
        String numStr = String.valueOf(num);
        System.out.println(numStr);
    }
    public static void equalsIgnoreCaseMethod(){
        String str = "My name is Alex";

        if(str.equals("My name is ALEX")){
            System.out.println("Ok");
        }
        else {
            System.out.println("Fail");
        }

        if(str.equalsIgnoreCase("My name is ALEX")){
            System.out.println("Ok with ignore case");
        }
        else {
            System.out.println("Fail");
        }
    }

    public static void LastIndexOfMethod(){
        String str = "Hello, My name is Alex";
        //System.out.println(str.indexOf('l'));
        System.out.println(str.lastIndexOf('l'));
    }
}
