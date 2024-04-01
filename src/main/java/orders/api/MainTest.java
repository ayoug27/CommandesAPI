package orders.api;

import orders.api.data.mockrepositories.MockDishRepository;
import orders.api.domain.dish.DishRepository;

public class MainTest {
    public static void main(String[] args) {
        DishRepository dishRepository = new MockDishRepository();

        System.out.println(dishRepository.getAllDishes());
        System.out.println(dishRepository.getDishById(2));
        System.out.println(dishRepository.getDishesByMenu(1));
    }
}
