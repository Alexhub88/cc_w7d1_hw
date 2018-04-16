import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    private Rollercoaster rollercoaster;
    private Visitor visitor1;
    private Visitor visitor2;
    private Visitor visitor3;

    @Before
    public void before(){
        this.rollercoaster = new Rollercoaster("Rollercoaster", 67, 8);
        this.visitor1 = new Visitor(17, 140, 200);
        this.visitor2 = new Visitor(11, 150, 80);
        this.visitor3 = new Visitor(18, 160, 80);
    }

    @Test
    public void testIsAllowedTo__fails_too_short() {
        assertEquals(false, rollercoaster.isAllowedTo(visitor1));
    }

    @Test
    public void testIsAllowedTo__fails_too_young() {
        assertEquals(false, rollercoaster.isAllowedTo(visitor2));
    }

    @Test
    public void testIsAllowedTo__passes() {
        assertEquals(true, rollercoaster.isAllowedTo(visitor3));
    }

    @Test
    public void testPriceFor__adult() {
        assertEquals(67, rollercoaster.priceFor(visitor1), 0.01);
    }

    @Test
    public void testPriceFor__child() {
        assertEquals(33.5, rollercoaster.priceFor(visitor2), 0.01);
    }
}
