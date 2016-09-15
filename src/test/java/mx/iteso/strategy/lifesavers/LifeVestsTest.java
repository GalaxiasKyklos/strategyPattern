package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.behaviors.impl.CanFloat;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Rodolfo on 15/09/2016.
 */
public class LifeVestsTest {
    public LifeVests lifeVests;
    @Before
    public void setUp() {
        lifeVests = new LifeVests();
    }

    @Test
    public void flotationTest() {
        assertEquals(CanFloat.FLOAT, lifeVests.floating());
    }

    @Test
    public void deflateTest() {
        assertEquals(NotDeflatable.DEFLATE, lifeVests.deflating());
    }

    @Test
    public void inflateTest() {
        assertEquals(NotDeflatable.INFLATE, lifeVests.inflating());
    }

    @Test
    public void rollTest() {
        assertEquals("I'm a Life Vests", lifeVests.display());
    }

}
