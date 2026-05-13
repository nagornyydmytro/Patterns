package L17_Iterator.L17E3;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        final Box root = new Box(-999);
        final Box box1 = new Box(1);
        final Box box2 = new Box(2);
        final Box box3 = new Box(3);

        root.add(box1);
        root.add(box2);

        box1.add(new Item("Item_1", 450));
        box1.add(new Item("Item_2", 120));

        box2.add(box3);
        box2.add(new Item("Item_3", 800));

        box3.add(new Item("Item_4", 50));
        box3.add(new Item("Item_5", 990));

        System.out.println("Depth first search:");
        Iterator<Component> depthFirstIterator = root.iterator();
        while (depthFirstIterator.hasNext()) {
            System.out.println(depthFirstIterator.next());
        }

        System.out.println();

        System.out.println("Breadth first search:");
        Iterator<Component> breadthFirstIterator = root.breadthFirstIterator();
        while (breadthFirstIterator.hasNext()) {
            System.out.println(breadthFirstIterator.next());
        }

        System.out.println();

        Item cheapestItem = findCheapestItem(root.iterator());
        Item mostExpensiveItem = findMostExpensiveItem(root.iterator());

        System.out.println("Cheapest item: " + cheapestItem);
        System.out.println("Most expensive item: " + mostExpensiveItem);
    }

    private static Item findCheapestItem(Iterator<Component> iterator) {
        Item cheapestItem = null;

        while (iterator.hasNext()) {
            Component component = iterator.next();
            if (component instanceof Item) {
                Item item = (Item) component;
                if (cheapestItem == null || item.getValue() < cheapestItem.getValue()) {
                    cheapestItem = item;
                }
            }
        }

        return cheapestItem;
    }

    private static Item findMostExpensiveItem(Iterator<Component> iterator) {
        Item mostExpensiveItem = null;

        while (iterator.hasNext()) {
            Component component = iterator.next();
            if (component instanceof Item) {
                Item item = (Item) component;
                if (mostExpensiveItem == null || item.getValue() > mostExpensiveItem.getValue()) {
                    mostExpensiveItem = item;
                }
            }
        }

        return mostExpensiveItem;
    }
}