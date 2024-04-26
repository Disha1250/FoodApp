import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import java.util.ArrayList;

public class RestaurantTest {

    @Test
    public void testAddOrder() {
        Restaurant restaurant = new Restaurant();
        Order order = new Order();
        restaurant.addOrder(order);
        assertTrue(restaurant.getOrders().contains(order));
    }

    @Test
    public void testRemoveOrder() {
        Restaurant restaurant = new Restaurant();
        Order order = new Order();
        restaurant.addOrder(order);
        restaurant.removeOrder(order);
        assertTrue(restaurant.getOrders().isEmpty());
    }

    @Test
    public void testCalculateRevenue() {
        Restaurant restaurant = new Restaurant();
        Order order1 = new Order();
        Order order2 = new Order();
        Item item1 = new Item("Item1", 10.0, 2, "Description1");
        Item item2 = new Item("Item2", 15.0, 1, "Description2");
        order1.addToCart(item1);
        order1.addToCart(item2);
        order2.addToCart(item1);
        restaurant.addOrder(order1);
        restaurant.addOrder(order2);
        assertEquals(55.0, restaurant.calculateRevenue(), 0.001);
    }
}
