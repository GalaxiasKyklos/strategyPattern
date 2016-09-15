package mx.iteso.strategy.balls;

import mx.iteso.strategy.behaviors.impl.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Rodolfo on 15/09/2016.
 */
public class BilliardBallTest {
    public BilliardBall billiardBall;

    @Before
    public void setUp() {
        billiardBall = new BilliardBall();
    }

    @Test
    public void bounceTest() {
        assertEquals(Crash.BOUNCE, billiardBall.performBounce());
    }

    @Test
    public void deflateTest() {
        assertEquals(NotDeflatable.DEFLATE, billiardBall.performDeflate());
    }

    @Test
    public void inflateTest() {
        assertEquals(NotDeflatable.INFLATE, billiardBall.performInflate());
    }

    @Test
    public void captureTest() {
        assertEquals(CannotCapture.CAPTURE, billiardBall.performCapture());
    }

    @Test
    public void releaseTest() {
        assertEquals(CannotCapture.RELEASE, billiardBall.performRelease());
    }

    @Test
    public void rollTest() {
        assertEquals("Billiard ball is rolling!", billiardBall.roll());
    }
}

