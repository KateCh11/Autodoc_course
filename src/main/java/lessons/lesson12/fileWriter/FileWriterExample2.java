package lessons.lesson12.fileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample2 {
    public static void main(String[] args) throws IOException {
        int start = 2;
        int finish = 9;
        writeExeption(start, finish);

    }

    public static void writeExeption(int start, int finish) throws IOException {
        FileWriter fileWriter = new FileWriter("src/lessons/lesson12/fileWriter/result2.txt");
        for (int i = start; i <= finish; i++){
            fileWriter.write("Это " + i + " итерация " + "\n");
        }
        fileWriter.close();
    }

}
