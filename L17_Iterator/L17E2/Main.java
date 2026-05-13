package L17_Iterator.L17E2;

import java.util.Iterator;

public class Main {

  public static void main(String[] args) {

    ShopItem pens = new ShopItem("pen", 175);
    ShopItem pencils = new ShopItem("pencil", 0);
    ShopItem paper = new ShopItem("paper", 500);

    Shop shop = new Shop();
    shop.putItem(pens);
    shop.putItem(pencils);
    shop.putItem(paper);

    System.out.println("Items by name:");
    for (ShopItem item : shop){
      System.out.println(item);
    }

    System.out.println();

    System.out.println("Items by quantity:");
    Iterator<ShopItem> quantityIterator = shop.quantityIterator();
    while (quantityIterator.hasNext()) {
      System.out.println(quantityIterator.next());
    }
  }
}