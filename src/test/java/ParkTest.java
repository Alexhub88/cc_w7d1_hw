import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ParkTest {
    private Park park;

    @Before
    public void before(){
        this.park = new Park("Park", 16, 1);
    }

    @Test
    public void testHasName() {
        assertEquals("Park", park.getName());
    }

    @Test
    public void testgetFunRating() {
        assertEquals(1, park.getFunRating());
    }
}
