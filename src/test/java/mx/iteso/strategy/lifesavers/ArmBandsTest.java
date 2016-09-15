package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.behaviors.impl.CanFloat;
import mx.iteso.strategy.behaviors.impl.Deflatable;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Rodolfo on 15/09/2016.
 */
public class ArmBandsTest {
    public ArmBands armBands;
    @Before
    public void setUp() {
        armBands = new ArmBands();
    }

    @Test
    public void flotationTest() {
        assertEquals(CanFloat.FLOAT, armBands.floating());
    }

    @Test
    public void deflateTest() {
        assertEquals(Deflatable.DEFLATE, armBands.deflating());
    }

    @Test
    public void inflateTest() {
        assertEquals(Deflatable.INFLATE, armBands.inflating());
    }

    @Test
    public void rollTest() {
        assertEquals("I'm a Arm bands", armBands.display());
    }


}
