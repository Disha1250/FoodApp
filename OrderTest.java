import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import java.util.ArrayList;

public class OrderTest {

    @Test
    public void testAddToCart() {
        Order order = new Order();
        Item item = new Item("TestItem", 10.0, 5, "Test Description", null);
        order.addToCart(item);
        assertTrue(order.getCart().contains(item));
    }

    @Test
    public void testRemoveFromCart() {
        Order order = new Order();
        Item item = new Item("TestItem", 10.0, 5, "Test Description", null);
        order.addToCart(item);
        order.removeFromCart(item);
        assertTrue(order.getCart().isEmpty());
    }

    @Test
    public void testUpdatePriceTotal() {
        Order order = new Order();
        Item item1 = new Item("Item1", 10.0, 2, "Description1", null);
        Item item2 = new Item("Item2", 15.0, 1, "Description2", null);
        order.addToCart(item1);
        order.addToCart(item2);
        order.updatePriceTotal();
        assertEquals(35.0, order.getPriceTotal(), 0.001);
    }
}
