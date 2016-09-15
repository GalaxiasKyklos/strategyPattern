package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.behaviors.impl.CanFloat;
import mx.iteso.strategy.behaviors.impl.Deflatable;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Rodolfo on 15/09/2016.
 */
public class SwimRingTest {
    public SwimRing swimRing;
    @Before
    public void setUp() {
        swimRing = new SwimRing();
    }

    @Test
    public void flotationTest() {
        assertEquals(CanFloat.FLOAT, swimRing.floating());
    }

    @Test
    public void deflateTest() {
        assertEquals(Deflatable.DEFLATE, swimRing.deflating());
    }

    @Test
    public void inflateTest() {
        assertEquals(Deflatable.INFLATE, swimRing.inflating());
    }

    @Test
    public void rollTest() {
        assertEquals("I'm a Swim ring", swimRing.display());
    }

}
