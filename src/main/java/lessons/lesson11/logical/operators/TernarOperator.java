package lessons.lesson11.logical.operators;

public class TernarOperator {
    public static void main(String[] args) {
        simpleOperator("How are you?");
        TernarOperator("How are you?");

    }

    public static void TernarOperator(String str){
        char lastChar = str.charAt(str.length()-1);
        String result = lastChar == '?' ? "Question" : "No question";
        System.out.println(result);
        //System.out.println(lastChar == '?' ? "Question" : "No question");
    }

    public static void simpleOperator(String str){
        char lastChar = str.charAt(str.length()-1);
        if (lastChar == '?'){
            System.out.println("Question");
        } else {
            System.out.println("No question");
        }

    }
}
