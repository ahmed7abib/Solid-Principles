package single_responsbility;

import single_responsbility.sales_example.best_practice.Item;
import single_responsbility.sales_example.best_practice.ShoppingFacade;

import java.util.ArrayList;
import java.util.List;

public class SRPProgram {

    public static void srpDemo() {
        List<Item> cart = new ArrayList<>();
        cart.add(new Item("I_1", 50.0, 3));
        cart.add(new Item("I_2", 60.0, 4));

        new ShoppingFacade().performShopping(cart);
    }
}
