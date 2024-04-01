package orders.api.resources;

import jakarta.ws.rs.Path;
import orders.api.domain.order.OrderRepository;
import orders.api.services.OrderService;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Produces;

@Path("/orders")
public class OrderResource {
    private OrderService service;

    public OrderResource() {}

    public OrderResource(OrderRepository repository){
        this.service = new OrderService(repository);
    }

    @GET
    @Path("check")
    @Produces("text/plain")
    public String hello() {
        return "Resource is working!";
    }

    @GET
    @Produces("application/json")
    public String getAllOrders() {
        return service.getAllOrders();
    }
}
