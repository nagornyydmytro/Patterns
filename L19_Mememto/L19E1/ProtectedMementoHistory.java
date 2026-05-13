package L19_Mememto.L19E1;

import java.util.ArrayList;
import java.util.List;

public class ProtectedMementoHistory {

    private final List<Triangle.ProtectedMemento> history = new ArrayList<>();

    public void save(Triangle.ProtectedMemento memento) {
        history.add(memento);
    }

    public Triangle.ProtectedMemento getMaxSquareMemento() {
        Triangle.ProtectedMemento maxSquareMemento = history.get(0);

        for (Triangle.ProtectedMemento memento : history) {
            if (memento.square() > maxSquareMemento.square()) {
                maxSquareMemento = memento;
            }
        }

        return maxSquareMemento;
    }
}