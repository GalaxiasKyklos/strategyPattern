package mx.iteso.strategy.balls;

import mx.iteso.strategy.behaviors.impl.CannotCapture;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AmericanFootballBallTest {
    public AmericanFootballBall americanFootballBall;

    @Before
    public void setUp() {
        americanFootballBall = new AmericanFootballBall();
    }

    @Test
    public void bounceTest() {
        assertEquals("I'm bouncing irregularly!", americanFootballBall.performBounce());
    }

    @Test
    public void deflateTest() {
        assertEquals("I'm deflating!", americanFootballBall.performDeflate());
    }

    @Test
    public void inflateTest() {
        assertEquals("I'm inflating!", americanFootballBall.performInflate());
    }

    @Test
    public void captureTest() {
        assertEquals(CannotCapture.CAPTURE, americanFootballBall.performCapture());
    }

    @Test
    public void releaseTest() {
        assertEquals(CannotCapture.RELEASE, americanFootballBall.performRelease());
    }

    @Test
    public void rollTest() {
        assertEquals("American Football ball is rolling!", americanFootballBall.roll());
    }
}
