package L20_Observer.L20E1.src;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileReader {

    private final String filePath;
    private final List<LineObserver> observers = new ArrayList<>();

    public FileReader(String filePath) {
        this.filePath = filePath;
    }

    public void addObserver(LineObserver observer) {
        observers.add(observer);
    }

    public void read() {
        try (BufferedReader reader = new BufferedReader(new java.io.FileReader(filePath))) {
            reader.lines().forEach(this::onLineRead);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void onLineRead(String line) {
        for (LineObserver observer : observers) {
            observer.update(line);
        }
    }
}