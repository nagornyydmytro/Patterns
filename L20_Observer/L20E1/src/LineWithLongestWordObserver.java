package L20_Observer.L20E1.src;

public class LineWithLongestWordObserver implements LineObserver {

    private String longestWord = "";
    private String lineWithLongestWord = "";

    @Override
    public void update(String line) {
        String[] words = line.split("\\s+");

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
                lineWithLongestWord = line;
            }
        }
    }

    public String getLineWithLongestWord() {
        return lineWithLongestWord;
    }
}