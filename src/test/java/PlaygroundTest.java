import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PlaygroundTest {

    private Playground playground;
    private Visitor visitor1;
    private Visitor visitor2;

    @Before
    public void before(){
        this.playground = new Playground("Playground", 77, 5);
        this.visitor1 = new Visitor(45, 160, 200);
        this.visitor2 = new Visitor(11, 110, 80);
    }

    @Test
    public void testIsAllowedTo__false() {
        assertEquals(false, playground.isAllowedTo(visitor1));
    }

    @Test
    public void testIsAllowedTo__true() {
        assertEquals(true, playground.isAllowedTo(visitor2));
    }
}
