package lessons.lesson7;

public class StringSplit {
    public static void main(String[] args) {
        String str = "My name is Alex";
        String[] words = str.split(" ");
        System.out.println(words.length-1);
        System.out.println(words[3]);
    }

}
