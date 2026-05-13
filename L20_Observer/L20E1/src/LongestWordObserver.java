package L20_Observer.L20E1.src;

public class LongestWordObserver implements LineObserver {

    private String longestWord = "";

    @Override
    public void update(String line) {
        String[] words = line.split("\\s+");

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
    }

    public String getLongestWord() {
        return longestWord;
    }
}