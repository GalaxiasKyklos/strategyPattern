package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.Lifesaver;
import mx.iteso.strategy.behaviors.impl.CanFloat;
import mx.iteso.strategy.behaviors.impl.CannotFloat;
import mx.iteso.strategy.behaviors.impl.Deflatable;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Rodolfo on 15/09/2016.
 */
public class LifesaverCandiesTest {
    public LifesaverCandies lifesaverCandies;
    @Before
    public void setUp() {
        lifesaverCandies = new LifesaverCandies();
    }

    @Test
    public void flotationTest() {
        assertEquals(CannotFloat.FLOAT, lifesaverCandies.floating());
    }

    @Test
    public void deflateTest() {
        assertEquals(NotDeflatable.DEFLATE, lifesaverCandies.deflating());
    }

    @Test
    public void inflateTest() {
        assertEquals(NotDeflatable.INFLATE, lifesaverCandies.inflating());
    }

    @Test
    public void rollTest() {
        assertEquals("I'm a Lifesaver Candy", lifesaverCandies.display());
    }

}
