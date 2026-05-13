package L19_Mememto.L19E1;

import java.util.ArrayList;
import java.util.List;

public class InnerMementoHistory {

    private final List<Triangle.InnerMemento> history = new ArrayList<>();

    public void save(Triangle.InnerMemento memento) {
        history.add(memento);
    }

    public Triangle.InnerMemento getMaxSquareMemento() {
        Triangle.InnerMemento maxSquareMemento = history.get(0);

        for (Triangle.InnerMemento memento : history) {
            if (memento.square() > maxSquareMemento.square()) {
                maxSquareMemento = memento;
            }
        }

        return maxSquareMemento;
    }
}