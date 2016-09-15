package mx.iteso.strategy.balls;

import mx.iteso.strategy.behaviors.impl.CannotCapture;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Saúl on 15/09/2016.
 */
public class BaseballBallTest {
    public BaseballBall baseballBall;

    @Before
    public void setUp() {
        baseballBall = new BaseballBall();
    }

    @Test
    public void bounceTest() {
        assertEquals("I'm bouncing irregularly!", baseballBall.performBounce());
    }

    @Test
    public void deflateTest() {
        assertEquals("I'm deflating!", baseballBall.performDeflate());
    }

    @Test
    public void inflateTest() {
        assertEquals("I'm inflating!", baseballBall.performInflate());
    }

    @Test
    public void captureTest() {
        assertEquals(CannotCapture.CAPTURE, baseballBall.performCapture());
    }

    @Test
    public void releaseTest() {
        assertEquals(CannotCapture.RELEASE, baseballBall.performRelease());
    }

    @Test
    public void rollTest() {
        assertEquals("BaseBall ball is rolling!", baseballBall.roll());
    }
}
