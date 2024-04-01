package orders.api.domain.order;

import java.util.ArrayList;

/**
 * OrderRepository interface represents the contract for order repository.
 * It defines the methods that any class implementing this interface should provide.
 */
public interface OrderRepository {
    /**
     * Adds a new order to the repository.
     *
     * @param order The order to be added.
     * @return true if the order was added successfully, false otherwise.
     */
    boolean addOrder(Order order);

    /**
     * Retrieves all orders from the repository.
     *
     * @return An ArrayList of all orders.
     */
    ArrayList<Order> getAllOrders();

    /**
     * Retrieves all active orders from the repository.
     *
     * @return An ArrayList of all active orders.
     */
    ArrayList<Order> getActiveOrders();

    /**
     * Retrieves all orders associated with a specific user.
     *
     * @param userId The id of the user to retrieve orders for.
     * @return An ArrayList of Order objects associated with the specified user.
     */
    ArrayList<Order> getOrdersByUser(int userId);

    /**
     * Retrieves an order by their id.
     *
     * @param id The id of the order to retrieve.
     * @return The Order object if found, null otherwise.
     */
    Order getOrderById(int id);

    /**
     * Updates an order in the repository.
     *
     * @param order The order to be updated.
     * @return true if the order was updated successfully, false otherwise.
     */
    boolean updateOrder(Order order);

    /**
     * Deletes an order by their id.
     *
     * @param id The id of the order to be deleted.
     * @return true if the order was deleted successfully, false otherwise.
     */
    boolean deleteOrderById(int id);

    /**
     * Deletes an order from the repository.
     *
     * @param order The order to be deleted.
     * @return true if the order was deleted successfully, false otherwise.
     */
    boolean deleteOrder(Order order);
}
