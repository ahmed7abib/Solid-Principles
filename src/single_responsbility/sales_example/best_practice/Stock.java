package single_responsbility.sales_example.best_practice;

import java.util.List;
import java.util.ArrayList;

public class Stock {
    private final List<Item> items = new ArrayList<>();

    public Stock() {
        items.add(new Item("I_1", 50.0, 10));
        items.add(new Item("I_2", 60.0, 20));
        items.add(new Item("I_3", 70.0, 30));
    }

    public List<Item> getItems() {
        return items;
    }

    public boolean isAvailableQuantity(Item item) {
        int availableQuantity = getItems().stream()
                .filter(it -> it.getCode().equals(item.getCode()))
                .map(Item::getQuantity)
                .findFirst()
                .orElse(0);

        return availableQuantity > item.getQuantity();
    }
}
