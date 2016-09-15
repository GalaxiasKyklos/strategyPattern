package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.behaviors.impl.CanFloat;
import mx.iteso.strategy.behaviors.impl.Deflatable;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Rodolfo on 15/09/2016.
 */
public class SwimSeatTest {
    public SwimSeat swimSeat;
    @Before
    public void setUp() {
        swimSeat = new SwimSeat();
    }

    @Test
    public void flotationTest() {
        assertEquals(CanFloat.FLOAT, swimSeat.floating());
    }

    @Test
    public void deflateTest() {
        assertEquals(Deflatable.DEFLATE, swimSeat.deflating());
    }

    @Test
    public void inflateTest() {
        assertEquals(Deflatable.INFLATE, swimSeat.inflating());
    }

    @Test
    public void rollTest() {
        assertEquals("I'm a Swim seat", swimSeat.display());
    }

}
