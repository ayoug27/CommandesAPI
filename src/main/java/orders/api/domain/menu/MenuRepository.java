package orders.api.domain.menu;

import java.util.ArrayList;

public interface MenuRepository {
    boolean addMenu(Menu menu);

    ArrayList<Menu> getAllMenus();

    Menu getMenuById(int id);

    ArrayList<Menu> getMenusByOrder(int orderId);

    boolean updateMenu(Menu menu);

    boolean deleteMenuById(int id);

    boolean deleteMenu(Menu menu);
}
