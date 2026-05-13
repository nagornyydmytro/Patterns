package L20_Observer.L20E1.src;

public class Main {

    public static void main(String[] args) {
        FileReader fileReader = new FileReader("L20_Observer/L20E1/resources/input01.txt");

        LongestLineObserver longestLineObserver = new LongestLineObserver();
        LongestWordObserver longestWordObserver = new LongestWordObserver();
        WordCountObserver wordCountObserver = new WordCountObserver();
        LineWithLongestWordObserver lineWithLongestWordObserver = new LineWithLongestWordObserver();

        fileReader.addObserver(longestLineObserver);
        fileReader.addObserver(longestWordObserver);
        fileReader.addObserver(wordCountObserver);
        fileReader.addObserver(lineWithLongestWordObserver);

        fileReader.read();

        System.out.println("Longest line: " + longestLineObserver.getLongestLine());
        System.out.println("Longest word: " + longestWordObserver.getLongestWord());
        System.out.println("Word count: " + wordCountObserver.getWordCount());
        System.out.println("Line with longest word: " + lineWithLongestWordObserver.getLineWithLongestWord());
    }
}