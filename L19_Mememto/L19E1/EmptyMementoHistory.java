package L19_Mememto.L19E1;

import java.util.ArrayList;
import java.util.List;

public class EmptyMementoHistory {

    private final List<Entry> history = new ArrayList<>();

    public void save(Triangle.EmptyMemento memento, float square) {
        history.add(new Entry(memento, square));
    }

    public Triangle.EmptyMemento getMaxSquareMemento() {
        Entry maxSquareEntry = history.get(0);

        for (Entry entry : history) {
            if (entry.square > maxSquareEntry.square) {
                maxSquareEntry = entry;
            }
        }

        return maxSquareEntry.memento;
    }

    private static class Entry {
        private final Triangle.EmptyMemento memento;
        private final float square;

        private Entry(Triangle.EmptyMemento memento, float square) {
            this.memento = memento;
            this.square = square;
        }
    }
}