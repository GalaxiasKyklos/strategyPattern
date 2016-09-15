package mx.iteso.strategy.balls;

import mx.iteso.strategy.behaviors.impl.CannotCapture;
import mx.iteso.strategy.behaviors.impl.Deflatable;
import mx.iteso.strategy.behaviors.impl.NormalBounce;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Rodolfo on 15/09/2016.
 */
public class VolleyBallTest {
    public VolleyBall volleyBall;

    @Before
    public void setUp() {
        volleyBall = new VolleyBall();
    }

    @Test
    public void bounceTest() {
        assertEquals(NormalBounce.BOUNCE, volleyBall.performBounce());
    }

    @Test
    public void deflateTest() {
        assertEquals(Deflatable.DEFLATE, volleyBall.performDeflate());
    }

    @Test
    public void inflateTest() {
        assertEquals(Deflatable.INFLATE, volleyBall.performInflate());
    }

    @Test
    public void captureTest() {
        assertEquals(CannotCapture.CAPTURE, volleyBall.performCapture());
    }

    @Test
    public void releaseTest() {
        assertEquals(CannotCapture.RELEASE, volleyBall.performRelease());
    }

    @Test
    public void rollTest() {
        assertEquals("VolleyBall is rolling!", volleyBall.roll());
    }
}

