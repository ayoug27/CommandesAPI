package orders.api.data.mockrepositories;

import orders.api.domain.dish.DishRepository;
import orders.api.domain.menu.Menu;
import orders.api.domain.menu.MenuRepository;

import java.util.ArrayList;

public class MockMenuRepository implements MenuRepository {
    private final DishRepository dishRepository;
    private final ArrayList<Menu> menus;

    public MockMenuRepository(DishRepository dishRepository) {
        this.dishRepository = dishRepository;
        menus = new ArrayList<>();

        Menu italianMenu = new Menu(1, "Menu Italien","Un menu tout droit venu d'Italie", this.dishRepository.getDishesByMenu(1));

        menus.add(italianMenu);
    }

    @Override
    public boolean addMenu(Menu menu) {
        return false;
    }

    @Override
    public ArrayList<Menu> getAllMenus() {
        return null;
    }

    @Override
    public Menu getMenuById(int id) {
        return null;
    }

    @Override
    public ArrayList<Menu> getMenusByOrder(int orderId) {
        return null;
    }

    @Override
    public boolean updateMenu(Menu menu) {
        return false;
    }

    @Override
    public boolean deleteMenuById(int id) {
        return false;
    }

    @Override
    public boolean deleteMenu(Menu menu) {
        return false;
    }
}
