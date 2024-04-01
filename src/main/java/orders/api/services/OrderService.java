package orders.api.services;

import com.google.gson.Gson;
import orders.api.domain.order.Order;
import orders.api.domain.order.OrderRepository;

import java.util.ArrayList;

public class OrderService {
    private final Gson gson = new Gson();

    protected OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public String getAllOrders() {
        ArrayList<Order> orders = orderRepository.getAllOrders();
        return gson.toJson(orders);
    }
}
