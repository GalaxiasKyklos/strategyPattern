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
public class BasketBallBallTest {
    public BasketBall basketBall;

    @Before
    public void setUp() {
        basketBall = new BasketBall();
    }

    @Test
    public void bounceTest() {
        assertEquals(NormalBounce.BOUNCE, basketBall.performBounce());
    }

    @Test
    public void deflateTest() {
        assertEquals(Deflatable.DEFLATE, basketBall.performDeflate());
    }

    @Test
    public void inflateTest() {
        assertEquals(Deflatable.INFLATE, basketBall.performInflate());
    }

    @Test
    public void captureTest() {
        assertEquals(CannotCapture.CAPTURE, basketBall.performCapture());
    }

    @Test
    public void releaseTest() {
        assertEquals(CannotCapture.RELEASE, basketBall.performRelease());
    }

    @Test
    public void rollTest() {
        assertEquals("Basketball ball is rolling!", basketBall.roll());
    }
}


