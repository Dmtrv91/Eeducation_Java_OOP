package p02_OpenClosedPrinciple.p03_ShoppingCart;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cart {

    private final List<OrderItem> items;

    public Cart() {
        this.items = new ArrayList<>();
    }

    public Iterable<OrderItem> getItems() {
        return Collections.unmodifiableList(this.items);
    }

    public void add(OrderItem orderItem) {
        this.items.add(orderItem);
    }
}
