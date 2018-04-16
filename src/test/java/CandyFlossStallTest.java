import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CandyFlossStallTest {
    private CandyFlossStall candyFlossStall;
    private Visitor visitor1;
    private Visitor visitor2;

    @Before
    public void before(){
        this.candyFlossStall = new CandyFlossStall("CandyFlossStall", "CandyFloss Corp",3,45, 7);
        this.visitor1 = new Visitor(45, 160, 200);
        this.visitor2 = new Visitor(11, 110, 80);
    }

    @Test
    public void testPriceFor__adult() {
        Assert.assertEquals(45, candyFlossStall.priceFor(visitor1), 0.01);
    }

    @Test
    public void testPriceFor__child() {
        Assert.assertEquals(45, candyFlossStall.priceFor(visitor2), 0.01);
    }
}
