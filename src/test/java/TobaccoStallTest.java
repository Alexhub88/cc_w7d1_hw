import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {


    private TobaccoStall tobaccostall;
    private Visitor visitor1;
    private Visitor visitor2;
    private Visitor visitor3;

    @Before
    public void before(){
        this.tobaccostall = new TobaccoStall("TobaccoStall", "Marlboro", 2,95, 9);
        this.visitor1 = new Visitor(17, 140, 200);
        this.visitor2 = new Visitor(11, 150, 80);
        this.visitor3 = new Visitor(18, 160, 80);
    }

    @Test
    public void testIsAllowedTo__fails_too_young() {
        assertEquals(false, tobaccostall.isAllowedTo(visitor1));
    }

    @Test
    public void testIsAllowedTo__passes() {
        assertEquals(true, tobaccostall.isAllowedTo(visitor3));
    }

    @Test
    public void testPriceFor__adult() {
        assertEquals(95, tobaccostall.priceFor(visitor3), 0.01);
    }

    @Test
    public void testPriceFor__child() {
        assertEquals(95, tobaccostall.priceFor(visitor2), 0.01);
    }
}
