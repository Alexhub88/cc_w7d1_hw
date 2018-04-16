import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class ThemeParkTest {

    private Rollercoaster rollercoaster;
    private Dodgems dodgems;
    private Playground playground;
    private Park park;
    private IceCreamStall iceCreamStall;
    private CandyFlossStall candyFlossStall;
    private TobaccoStall tobaccoStall;
    private ArrayList<IEnjoyable> enjoyables;
    private ThemePark themePark;


    @Before
    public void before(){
        this.rollercoaster = new Rollercoaster("Rollercoaster", 67, 8);
        this.dodgems = new Dodgems("Dodgems", 57, 2);
        this.playground = new Playground("Playground", 77, 5);
        this.park = new Park("Park", 16, 1);
        this.iceCreamStall = new IceCreamStall("IceCreamStall", "Ice Cream Corp", 4, 56, 6);
        this.candyFlossStall = new CandyFlossStall("CandyFlossStall", "CandyFloss Corp",3,45, 7);
        this.tobaccoStall = new TobaccoStall("TobaccoStall", "Marlboro", 2,95, 9);
        enjoyables =  new ArrayList<>();
        enjoyables.add(rollercoaster);
        enjoyables.add(dodgems);
        enjoyables.add(playground);
        enjoyables.add(park);
        enjoyables.add(iceCreamStall);
        enjoyables.add(candyFlossStall);
        enjoyables.add(tobaccoStall);
        this.themePark = new ThemePark(enjoyables);
    }

    @Test
    public void testShowFunRatings(){
        assertEquals("Rollercoaster: 8, Dodgems: 2, Playground: 5, Park: 1, IceCreamStall: 6, CandyFlossStall: 7, TobaccoStall: 9", themePark.showFunRatings() );
    }

}
