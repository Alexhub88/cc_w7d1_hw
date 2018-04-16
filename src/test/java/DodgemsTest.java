import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {

    private Dodgems dodgems;
    private Visitor visitor1;
    private Visitor visitor2;

    @Before
    public void before(){
        this.dodgems = new Dodgems("Dodgems", 57, 2);
        this.visitor1 = new Visitor(17, 140, 200);
        this.visitor2 = new Visitor(11, 150, 80);
    }

    @Test
    public void testPriceFor__adult() {
        assertEquals(57, dodgems.priceFor(visitor1), 0.01);
    }

    @Test
    public void testPriceFor__child() {
        assertEquals(28.5, dodgems.priceFor(visitor2), 0.01);
    }
}
