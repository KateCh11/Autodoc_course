package lessons.lesson14.exeption;

public class CastomExeption extends Exception {

    private int details;

    public CastomExeption(int details, String message) {
        super(message);
        this.details = details;
    }


    @Override
    public String toString() {
        return "CastomExeption{" +
                "details=" + details + " " + getMessage() +
                '}';
    }
}
