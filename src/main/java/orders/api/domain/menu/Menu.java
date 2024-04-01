package orders.api.domain.menu;

import orders.api.domain.dish.Dish;

import java.util.ArrayList;

public class Menu {
    private int id;
    private String name;
    private String description;
    private ArrayList<Dish> dishes;
    private double price = 0;

    public Menu(int id, String name, String description, ArrayList<Dish> dishes) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.dishes = dishes;
        for (Dish dish : dishes)
            this.price += dish.getPrice();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public ArrayList<Dish> getDishes() {
        return dishes;
    }

    public double getPrice() {
        return price;
    }
}
