package L17_Iterator.L17E2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ShopItemsByNameIterator implements Iterator<ShopItem> {

    private final List<ShopItem> items;
    private int position = 0;

    public ShopItemsByNameIterator(Collection<ShopItem> items) {
        this.items = new ArrayList<>(items);
        this.items.sort(Comparator.comparing(ShopItem::getName));
    }

    @Override
    public boolean hasNext() {
        return position < items.size();
    }

    @Override
    public ShopItem next() {
        return items.get(position++);
    }
}