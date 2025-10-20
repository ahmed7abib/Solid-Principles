package single_responsbility.sales_example.violation_scenario;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private final List<Item> cartItems = new ArrayList<>();

    public void removeFromCart(Item item) {
        cartItems.removeIf(it -> item.getCode().equals(it.getCode()));
    }

    public boolean addToCart(Item item) {
        int availableItems = new Stock().getItems().stream()
                .filter(it -> it.getCode().equals(item.getCode()))
                .map(Item::getQuantity)
                .findFirst()
                .orElse(0);

        if (availableItems > item.getQuantity()) {
            cartItems.add(item);
            return true;
        } else {
            return false;
        }
    }

    public int getItemsCount() {
        return cartItems.size();
    }

    public void createInvoice() {
        double totalPrice = cartItems.stream()
                .mapToDouble(item -> item.getPrice() * item.getQuantity())
                .sum();

        System.out.println("Total price = " + totalPrice);
    }
}
