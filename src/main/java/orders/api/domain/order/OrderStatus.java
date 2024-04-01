package orders.api.domain.order;

/**
 * OrderStatus is an enumeration that represents the status of an order.
 */
public enum OrderStatus {
    /** The order has been placed but not yet delivered. */
    PENDING,

    /** The order has been delivered to the customer. */
    DELIVERED,

    /** The order has been canceled. */
    CANCELED
}
