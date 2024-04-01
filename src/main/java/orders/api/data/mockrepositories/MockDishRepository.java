package orders.api.data.mockrepositories;

import orders.api.domain.dish.Dish;
import orders.api.domain.dish.DishRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

public class MockDishRepository implements DishRepository {
    private final ArrayList<Dish> dishes;
    private final HashMap<Integer, ArrayList<Dish>> menuDishes;

    public MockDishRepository() {
        dishes = new ArrayList<>();
        menuDishes = new HashMap<>();

        // Pre-made dishes
        Dish pizza = new Dish(1, "Pizza", 10.99, "Délicieuse pizza au fromage");
        Dish burger = new Dish(2, "Burger", 8.99, "Burger au boeuf juteux");
        Dish pasta = new Dish(3, "Pâtes", 9.99, "Pâtes à la mode italienne");
        Dish roastChicken = new Dish(4, "Poulet rôti", 12.99, "Poulet rôti croustillant");
        Dish caesarSalad = new Dish(5, "Salade César", 7.99, "Salade César fraîche et croquante");

        dishes.add(pizza);
        dishes.add(burger);
        dishes.add(pasta);
        dishes.add(roastChicken);
        dishes.add(caesarSalad);

        menuDishes.put(1, new ArrayList<>(Arrays.asList(pasta,caesarSalad)));
    }

    @Override
    public boolean addDish(Dish dish) {
        return dishes.add(dish);
    }

    @Override
    public ArrayList<Dish> getAllDishes() {
        return dishes;
    }

    @Override
    public Dish getDishById(int id) {
        return dishes.stream().filter(dish -> dish.getId() == id).findFirst().orElse(null);
    }

    @Override
    public ArrayList<Dish> getDishesByMenu(int menuID) {
        ArrayList<Dish> dishes = menuDishes.get(menuID);
        return Objects.requireNonNullElseGet(dishes, ArrayList::new);
    }

    @Override
    public boolean updateDish(Dish dish) {
        return false;
    }

    @Override
    public boolean deleteDishById(int id) {
        return dishes.removeIf(dish -> dish.getId() == id);
    }
}
