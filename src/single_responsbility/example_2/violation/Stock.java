package single_responsbility.example_2.violation;

import java.util.ArrayList;
import java.util.List;

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
}
