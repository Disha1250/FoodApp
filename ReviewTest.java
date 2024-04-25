import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ReviewTest {

    @Test
    public void testGetRating() {
        Review review = new Review(5, "Excellent service!");
        assertEquals(5, review.getRating());
    }

    @Test
    public void testGetFeedback() {
        Review review = new Review(5, "Excellent service!");
        assertEquals("Excellent service!", review.getFeedback());
    }
}
