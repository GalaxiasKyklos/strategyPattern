package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.behaviors.impl.CanFloat;
import mx.iteso.strategy.behaviors.impl.Deflatable;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Rodolfo on 15/09/2016.
 */
public class SwimBeltsTest {
    public SwimBelts swimBelts;
    @Before
    public void setUp() {
        swimBelts = new SwimBelts();
    }

    @Test
    public void flotationTest() {
        assertEquals(CanFloat.FLOAT, swimBelts.floating());
    }

    @Test
    public void deflateTest() {
        assertEquals(NotDeflatable.DEFLATE, swimBelts.deflating());
    }

    @Test
    public void inflateTest() {
        assertEquals(NotDeflatable.INFLATE, swimBelts.inflating());
    }

    @Test
    public void rollTest() {
        assertEquals("I'm a Swim Belts", swimBelts.display());
    }

}
