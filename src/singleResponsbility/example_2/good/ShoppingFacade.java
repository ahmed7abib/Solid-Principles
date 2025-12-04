package singleResponsbility.example_2.good;

import java.util.List;

public class ShoppingFacade {

    public void performShopping(List<Item> cart) {
        cart.forEach(new ShoppingCart()::addToCart);
        new SalesInvoice().createInvoice(cart);
    }
}
