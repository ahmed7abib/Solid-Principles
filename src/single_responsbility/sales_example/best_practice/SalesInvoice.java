package single_responsbility.sales_example.best_practice;

import java.util.List;

public class SalesInvoice {

    private final PrintManager printManager;

    public SalesInvoice() {
        printManager = new PrintManager();
    }

    public void createInvoice(List<Item> cartItems) {
        double totalPrice = getTotalPrice(cartItems);
        printManager.print("Total price = " + totalPrice);
    }

    private double getTotalPrice(List<Item> cartItems) {
        return cartItems.stream()
                .mapToDouble(item -> item.getPrice() * item.getQuantity())
                .sum();
    }
}