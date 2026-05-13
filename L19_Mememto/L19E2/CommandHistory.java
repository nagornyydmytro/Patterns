package L19_Mememto.L19E2;

import java.util.ArrayList;
import java.util.List;

public class CommandHistory {

    private final Triangle triangle;
    private final List<Triangle.Memento> history = new ArrayList<>();

    public CommandHistory(Triangle triangle) {
        this.triangle = triangle;
    }

    public void save() {
        history.add(triangle.save());
    }

    public void execute(Command command) {
        command.execute();
        save();
    }

    public Triangle.Memento getMinSquareMemento() {
        Triangle.Memento minSquareMemento = history.get(0);

        for (Triangle.Memento memento : history) {
            if (memento.square() < minSquareMemento.square()) {
                minSquareMemento = memento;
            }
        }

        return minSquareMemento;
    }
}