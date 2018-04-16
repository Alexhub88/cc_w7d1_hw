import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceCreamStallTest {

    private IceCreamStall icecreamstall;
    private Visitor visitor1;
    private Visitor visitor2;

    @Before
    public void before(){
        this.icecreamstall = new IceCreamStall("IceCreamStall", "Ice Cream Corp", 4, 56, 6);
        this.visitor1 = new Visitor(17, 140, 200);
        this.visitor2 = new Visitor(11, 150, 80);
    }

    @Test
    public void testGetFunRating() {
        assertEquals(6, icecreamstall.getFunRating());
    }

    @Test
    public void testPriceFor__adult() {
        assertEquals(56, icecreamstall.priceFor(visitor1), 0.01);
    }

    @Test
    public void testPriceFor__child() {
        assertEquals(56, icecreamstall.priceFor(visitor2), 0.01);
    }
}
