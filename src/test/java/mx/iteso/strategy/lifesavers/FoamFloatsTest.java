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
public class FoamFloatsTest {
    public FoamFloats foamFloats;
    @Before
    public void setUp() {
        foamFloats = new FoamFloats();
    }

    @Test
    public void flotationTest() {
        assertEquals(CanFloat.FLOAT, foamFloats.floating());
    }

    @Test
    public void deflateTest() {
        assertEquals(NotDeflatable.DEFLATE, foamFloats.deflating());
    }

    @Test
    public void inflateTest() {
        assertEquals(NotDeflatable.INFLATE, foamFloats.inflating());
    }

    @Test
    public void rollTest() {
        assertEquals("I'm a Foam Floats", foamFloats.display());
    }

}
