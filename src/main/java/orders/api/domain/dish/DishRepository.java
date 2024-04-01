package orders.api.domain.dish;

import orders.api.domain.menu.Menu;

import java.util.ArrayList;

/**
 * DishRepository interface represents the contract for dish repository.
 * It defines the methods that any class implementing this interface should provide.
 */
public interface DishRepository {
    /**
     * Adds a new dish to the repository.
     *
     * @param dish The dish to be added.
     * @return true if the dish was added successfully, false otherwise.
     */
    boolean addDish(Dish dish);

    /**
     * Retrieves all dishes from the repository.
     *
     * @return An ArrayList of all dishes.
     */
    ArrayList<Dish> getAllDishes();

    /**
     * Retrieves a dish by their id.
     *
     * @param id The id of the dish to retrieve.
     * @return The Dish object if found, null otherwise.
     */
    Dish getDishById(int id);

    ArrayList<Dish> getDishesByMenu(int menuID);


    /**
     * Updates a dish in the repository.
     *
     * @param dish The dish to be updated.
     * @return true if the dish was updated successfully, false otherwise.
     */
    boolean updateDish(Dish dish);

    /**
     * Deletes a dish by their id.
     *
     * @param id The id of the dish to be deleted.
     * @return true if the dish was deleted successfully, false otherwise.
     */
    boolean deleteDishById(int id);

}