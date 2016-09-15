package mx.iteso.strategy.balls;

import mx.iteso.strategy.behaviors.impl.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Rodolfo on 15/09/2016.
 */
public class PokeBallTest {
    public PokeBall pokeBall;

    @Before
    public void setUp() {
        pokeBall = new PokeBall();
    }

    @Test
    public void bounceTest() {
        assertEquals(NormalBounce.BOUNCE, pokeBall.performBounce());
    }

    @Test
    public void deflateTest() {
        assertEquals(NotDeflatable.DEFLATE, pokeBall.performDeflate());
    }

    @Test
    public void inflateTest() {
        assertEquals(Deflatable.INFLATE, pokeBall.performInflate());
    }

    @Test
    public void captureTest() {
        assertEquals(CanCapture.CAPTURE, pokeBall.performCapture());
    }

    @Test
    public void releaseTest() {
        assertEquals(CanCapture.RELEASE, pokeBall.performRelease());
    }

    @Test
    public void rollTest() {
        assertEquals("Pokeball is rolling!", pokeBall.roll());
    }
}

