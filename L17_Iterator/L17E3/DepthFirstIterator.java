package L17_Iterator.L17E3;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class DepthFirstIterator implements Iterator<Component> {

    private final Stack<Component> stack = new Stack<>();

    public DepthFirstIterator(Component root) {
        stack.push(root);
    }

    @Override
    public boolean hasNext() {
        return !stack.empty();
    }

    @Override
    public Component next() {
        Component component = stack.pop();

        if (component instanceof Box) {
            List<Component> components = ((Box) component).getComponents();
            for (int i = components.size() - 1; i >= 0; i--) {
                stack.push(components.get(i));
            }
        }

        return component;
    }
}