package L20_Observer.L20E1.src;

public class LongestLineObserver implements LineObserver {

    private String longestLine = "";

    @Override
    public void update(String line) {
        if (line.length() > longestLine.length()) {
            longestLine = line;
        }
    }

    public String getLongestLine() {
        return longestLine;
    }
}