package homeworks.additional;

/*Write a function that accepts an integer n and a string s as parameters, and returns a string of s repeated exactly n times.

Examples (input -> output)
6, "I"     -> "IIIIII"
5, "Hello" -> "HelloHelloHelloHelloHello"*/

public class IntStr {
    public static void main(String[] args) {

        repeatStr(2,"Max");
        System.out.println(repeatStr(7,"Max"));

    }
    public static String repeatStr(final int repeat, final String string) {
        String str="";
        for (int i = 0; i < repeat; i++)
        {
            str = str.concat(string);
        }
        return str;
    }
}
