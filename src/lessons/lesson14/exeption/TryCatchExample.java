package lessons.lesson14.exeption;

import javax.imageio.IIOException;
import java.io.FileWriter;
import java.io.IOError;
import java.io.IOException;

public class TryCatchExample {
    public static void main(String[] args) {
        writeSomething();
        //writeSomethingWithThrows();
    }

    public static void writeSomethingWithThrows() throws IOException {
        FileWriter fileWriter = new FileWriter("somefile.txt");
        fileWriter.close();
        fileWriter.write("some");
        System.out.println("Программа работает дальше");
    }


    public static void writeSomething() {
        try {
            FileWriter fileWriter = new FileWriter("somefile.txt");
            fileWriter.close();
            fileWriter.write("some");
        } catch (IIOException e) {
            //e.printStackTrace();
            System.err.println("Открой поток");
        } catch (IOException e) {
            //throw new RuntimeException(e);
        } finally {
            System.out.println("Я выполнюсь всегда");
        }
        System.out.println("Программа работает дальше");
    }
}
