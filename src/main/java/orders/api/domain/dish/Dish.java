package orders.api.domain.dish;

/**
 * Dish class represents a dish in the system.
 */
public class Dish {
    /** Unique identifier for the dish */
    private final int id;

    /** Name of the dish */
    private String name;

    /** Price of the dish */
    private double price;

    /** Description of the dish */
    private String description;

    /**
     * Constructor for the Dish class.
     *
     * @param id          Unique identifier for the dish
     * @param name        Name of the dish
     * @param price       Price of the dish
     * @param description Description of the dish
     */
    public Dish(int id, String name, double price, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    /**
     * Returns the unique identifier of the dish.
     *
     * @return id of the dish
     */
    public int getId() {
        return id;
    }

    /**
     * Returns the name of the dish.
     *
     * @return name of the dish
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the price of the dish.
     *
     * @return price of the dish
     */
    public double getPrice() {
        return price;
    }

    /**
     * Returns the description of the dish.
     *
     * @return description of the dish
     */
    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
