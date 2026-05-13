package L17_Iterator.L17E2;

import java.util.HashMap;
import java.util.Iterator;

public class Shop implements Iterable<ShopItem> {

    private final HashMap<String, ShopItem> items = new HashMap<>();

    void putItem(ShopItem item){
        items.put(item.getName(), item);
    }

    @Override
    public Iterator<ShopItem> iterator() {
        return new ShopItemsByNameIterator(items.values());
    }

    public Iterator<ShopItem> quantityIterator() {
        return new ShopItemsByQuantityIterator(items.values());
    }
}