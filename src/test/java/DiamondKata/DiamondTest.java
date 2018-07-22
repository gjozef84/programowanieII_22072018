package DiamondKata;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Grzesiek on 2018-07-22
 */
public class DiamondTest {

    Diamond diamond;

    @Before
    public void setUp() throws Exception {
        diamond = new Diamond();
    }

    @Test
    public void diamondGeneratorOnlyA() {
        String expDiamond="A";
        assertEquals(expDiamond, diamond.diamondGenerator('A'));
    }

    @Test
    public void diamondGeneratorB() {
        String expDiamond=" A \n" +
                          "B B\n" +
                          " A ";
        assertEquals(expDiamond, diamond.diamondGenerator('B'));
    }

    @Test
    public void diamondGeneratorC() {
        String expDiamond="  A  \n" +
                " B B \n" +
                "C   C\n"+
                " B B \n" +
                "  A  ";
        assertEquals(expDiamond, diamond.diamondGenerator('C'));
    }

    @Test
    public void diamondGeneratorE() {
        String expDiamond=
                "    A    \n" +
                "   B B   \n" +
                "  C   C  \n"+
                " D     D \n"+
                "E       E\n"+
                " D     D \n"+
                "  C   C  \n"+
                "   B B   \n" +
                "    A    ";
        assertEquals(expDiamond, diamond.diamondGenerator('E'));
    }
}