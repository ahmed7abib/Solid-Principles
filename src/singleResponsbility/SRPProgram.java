package singleResponsbility;

import singleResponsbility.example_2.good.Item;
import singleResponsbility.example_2.good.ShoppingFacade;

import java.util.ArrayList;
import java.util.List;

public class SRPProgram {

    public static void main(String[] args) {
        List<Item> cart = new ArrayList<>();
        cart.add(new Item("I_1", 50.0, 3));
        cart.add(new Item("I_2", 60.0, 4));
        new ShoppingFacade().performShopping(cart);
    }
}
