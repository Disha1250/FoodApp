import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ItemTest {

    @Test
    public void testUpdateItem() {
        Item item = new Item("TestItem", 10.0, 5, "Test Description");
        item.updateItem("NewName", 15.0, "New Description");
        assertEquals("NewName", item.getName());
        assertEquals(15.0, item.getPrice(), 0.001); 
        assertEquals("New Description", item.getDesc());
    }

    @Test
    public void testUpdateQuant() {
        Item item = new Item("TestItem", 10.0, 5, "Test Description");
        item.updateQuant(7);
        assertEquals(7, item.getQuant());
    }
}
