package L17_Iterator.L17E3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Box implements Component, Iterable<Component> {

    private final int id;
    private final List<Component> components = new ArrayList<>();

    public Box(int id) {
        this.id = id;
    }

    public void add(Component component) {
        components.add(component);
    }

    public List<Component> getComponents() {
        return components;
    }

    @Override
    public void execute() {
        System.out.println(this);
        for (Component component : components) {
            component.execute();
        }
    }

    @Override
    public Iterator<Component> iterator() {
        return new DepthFirstIterator(this);
    }

    public Iterator<Component> breadthFirstIterator() {
        return new BreadthFirstIterator(this);
    }

    @Override
    public String toString() {
        return "Box{" +
                "id=" + id +
                '}';
    }
}