package orders.api.domain.order;

import orders.api.domain.menu.Menu;

import java.util.ArrayList;
import java.util.Date;

public class Order {
    private int id;
    private ArrayList<Menu> menus;
    private Date orderDate;
    private String deliveryAddress;
    private OrderStatus status;
    private Date deliveryDate;
    private double price = 0;

    public Order(int id, ArrayList<Menu> menus, Date orderDate, String deliveryAddress, OrderStatus status, Date deliveryDate) {
        this.id = id;
        this.menus = menus;
        this.orderDate = orderDate;
        this.deliveryAddress = deliveryAddress;
        this.status = status;
        this.deliveryDate = deliveryDate;
        for (Menu menu : menus)
            this.price += menu.getPrice();
    }
}
