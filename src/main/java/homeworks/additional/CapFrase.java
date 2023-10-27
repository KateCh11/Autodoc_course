package homeworks.additional;

/*Jaden Smith, the son of Will Smith, is the star of films such as The Karate Kid (2010)
and After Earth (2013). Jaden is also known for some of his philosophy that he delivers via Twitter.
 When writing on Twitter, he is known for almost always capitalizing every word. For simplicity,
 you'll have to capitalize each word, check out how contractions are expected to be in the example below.

Your task is to convert strings to how they would be written by Jaden Smith. The strings are actual quotes fro*/

public class CapFrase {
    public static void main(String[] args) {
        //System.out.println(toUpperCase4String("asdasd asdas ddd"));
        //System.out.println(toJadenCase2("Hello world"));
        System.out.println(toJadenCase3("how are you doing"));
    }

   /* static String toUpperCase4String(String a) {
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == ' ') {
                a = a.replace(a.charAt(i + 1), Character.toUpperCase(a.charAt(i + 1)));
            }
        }
        return a;
    }

    */

    /*
    public String toJadenCase(String phrase) {
        // TODO put your code below this comment
        for (int i = 0; i < phrase.length(); i++) {
            if (phrase.charAt(1) == ' ') {
                Character.toUpperCase(phrase.charAt(i + 1));
            }
        }
        System.out.println(phrase);

        return phrase;
    }
*/
  /*  public static String toJadenCase2(String phrase) {
        return phrase.substring(0, 1).toUpperCase() + phrase.substring(1);
    }*/

  /*  public static String toJadenCase3(String phrase) {
        StringBuilder builder = new StringBuilder(phrase);
        //выставляем первый символ заглавным, если это буква
        if (Character.isAlphabetic(phrase.codePointAt(0)))
            builder.setCharAt(0, Character.toUpperCase(phrase.charAt(0)));

        //крутимся в цикле, и меняем буквы, перед которыми пробел на заглавные
        for (int i = 1; i < phrase.length(); i++)
            if (Character.isAlphabetic(phrase.charAt(i)) && Character.isSpaceChar(phrase.charAt(i - 1)))
                builder.setCharAt(i, Character.toUpperCase(phrase.charAt(i)));

        return builder.toString();
    }
*/
    public static String toJadenCase3(String phrase) {
        String str = "how are you doing";
        String[] words = str.split(" ");
        String result = "";
        for (String word : words) {
            if (word.length() > 0)
                result = result + word.substring(0, 1).toUpperCase() + word.substring(1) + " ";
        }
        System.out.println(result.trim());
        return str;
    }


}
