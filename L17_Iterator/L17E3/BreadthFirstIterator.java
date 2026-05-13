package L17_Iterator.L17E3;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstIterator implements Iterator<Component> {

    private final Queue<Component> queue = new LinkedList<>();

    public BreadthFirstIterator(Component root) {
        queue.add(root);
    }

    @Override
    public boolean hasNext() {
        return !queue.isEmpty();
    }

    @Override
    public Component next() {
        Component component = queue.remove();

        if (component instanceof Box) {
            queue.addAll(((Box) component).getComponents());
        }

        return component;
    }
}