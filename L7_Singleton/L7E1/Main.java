package L7_Singleton.L7E1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        String filePath = "L7_Singleton/L7E1/sample.txt";

        String sampleText = "Hello world\nThis is a singleton example\nJava patterns";
        Files.write(Paths.get(filePath), sampleText.getBytes());

        TextFileProcessor processor1 = TextFileProcessor.getInstance();
        TextFileProcessor processor2 = TextFileProcessor.getInstance();

        String text = processor1.readFile(filePath);

        System.out.println("Same instance: " + (processor1 == processor2));
        System.out.println("File content:");
        System.out.println(text);
        System.out.println("Lines: " + processor1.countLines(text));
        System.out.println("Words: " + processor1.countWords(text));
        System.out.println("Characters: " + processor1.countCharacters(text));
        System.out.println("Uppercase:");
        System.out.println(processor1.toUpperCase(text));
    }
}