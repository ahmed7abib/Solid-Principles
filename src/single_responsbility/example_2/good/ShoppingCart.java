package single_responsbility.example_2.good;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private final Stock stock;
    private final List<Item> cartItems = new ArrayList<>();

    public ShoppingCart() {
        stock = new Stock();
    }

    public void addToCart(Item item) {
        if (stock.isAvailableQuantity(item)) {
            cartItems.add(item);
        }
    }

    public void removeFromCart(Item item) {
        cartItems.removeIf(it -> item.getCode().equals(it.getCode()));
    }

    public int getItemsCount() {
        return cartItems.size();
    }
}
