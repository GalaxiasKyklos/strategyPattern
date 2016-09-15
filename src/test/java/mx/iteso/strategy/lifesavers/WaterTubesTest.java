package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.behaviors.impl.CanFloat;
import mx.iteso.strategy.behaviors.impl.Deflatable;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Rodolfo on 15/09/2016.
 */
public class WaterTubesTest {
    public WaterTubes waterTubes;
    @Before
    public void setUp() {
        waterTubes = new WaterTubes();
    }

    @Test
    public void flotationTest() {
        assertEquals(CanFloat.FLOAT, waterTubes.floating());
    }

    @Test
    public void deflateTest() {
        assertEquals(Deflatable.DEFLATE, waterTubes.deflating());
    }

    @Test
    public void inflateTest() {
        assertEquals(Deflatable.INFLATE, waterTubes.inflating());
    }

    @Test
    public void rollTest() {
        assertEquals("I'm a Water Tubes", waterTubes.display());
    }

}
