package lessons.lesson5;

public class StringMethods {
    public static void main(String[] args) {
        //lengthMethod();
        //concathMethod();
        //trimMethod();
        //endsWithMethod();
        //caseMethods();
        //equalsMethods();
        //containsMethod();
        //charAtMethod();
        //toCharArray();
        //indexOMethods();
        subStringMethods();
        //replaceMethods();
    }

    public static void replaceMethods(){
        String str = "My name is Alex";
        String replaceStr = str.replace("Alex", "Max");
        System.out.println(replaceStr);

    }

    public static void subStringMethods(){
        String str = "My name is Alex";
        System.out.println(str.substring(8));
        System.out.println(str.substring(0, 9));
    }

    public static void indexOMethods(){
        String str = "My name is Alex";
        System.out.println(str.indexOf("M"));
        System.out.println(str.indexOf("is"));
        System.out.println(str.indexOf("A"));
    }

    public static void toCharArray(){
        String str = "My name is Alex";
        char[] result = str.toCharArray();

        for (Character r : result){
            System.out.print(r + " ");
        }
    }

    public static void charAtMethod(){
        String str = "My name is Kate";
        char result = str.charAt(4);
        System.out.println(result);
    }

    public static void containsMethod(){
        String str1 = "My name is Kate";
        String str2 = "Kate";
        System.out.println(str1.contains(str2));
    }

    public static void equalsMethods(){
        String str1 = "My name is Kate";
        String str2 = "My name is Kate";
        System.out.println(str1.equals(str2));
    }

    public static void caseMethods(){
        String str = "My name is Kate";
        String toUpper = str.toUpperCase();
        String toLower = str.toLowerCase();

        System.out.println(toUpper);
        System.out.println(toLower);
    }


    public static void endsWithMethod(){
        String str = "   My    name is    Kate";
        boolean end1 = str.endsWith("Kate");
        boolean end2 = str.endsWith("Max");
        System.out.println(end1);
        System.out.println(end2);
    }

    public static void trimMethod(){
        String str = "   My    name is    fg ";
        System.out.println(str.trim());
        System.out.println(str);
    }

    public static void concathMethod(){
        String text1 = "Hello ";
        String text2 = "worls";
        String result = text1.concat(text2);
        System.out.println(result);
    }

    public static void lengthMethod(){
        String name = "Alex Alex";
        System.out.println(name.length());
    }
}
