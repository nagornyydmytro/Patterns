package L20_Observer.L20E1.src;

public class WordCountObserver implements LineObserver {

    private int wordCount = 0;

    @Override
    public void update(String line) {
        if (!line.isBlank()) {
            wordCount += line.split("\\s+").length;
        }
    }

    public int getWordCount() {
        return wordCount;
    }
}