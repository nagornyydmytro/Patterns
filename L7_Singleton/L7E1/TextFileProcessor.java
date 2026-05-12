package L7_Singleton.L7E1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TextFileProcessor {
    private static TextFileProcessor instance;

    private TextFileProcessor() {
    }

    public static TextFileProcessor getInstance() {
        if (instance == null) {
            instance = new TextFileProcessor();
        }
        return instance;
    }

    public String readFile(String filePath) throws IOException {
        byte[] bytes = Files.readAllBytes(Paths.get(filePath));
        return new String(bytes);
    }

    public int countLines(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }
        return text.split("\\R").length;
    }

    public int countWords(String text) {
        if (text == null || text.trim().isEmpty()) {
            return 0;
        }
        return text.trim().split("\\s+").length;
    }

    public int countCharacters(String text) {
        if (text == null) {
            return 0;
        }
        return text.length();
    }

    public String toUpperCase(String text) {
        if (text == null) {
            return "";
        }
        return text.toUpperCase();
    }
}