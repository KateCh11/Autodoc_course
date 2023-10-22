package lessons.lesson12.fileReaderExample;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReAaderExample {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("src/lessons/lesson12/fileWriter/result2.txt");
        Scanner scanner = new Scanner(fileReader);

        while (scanner.hasNext()){
            System.out.println(scanner.nextLine());
        }
        fileReader.close();

    }
}
