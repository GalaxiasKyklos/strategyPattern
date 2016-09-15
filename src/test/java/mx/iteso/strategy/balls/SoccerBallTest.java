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
public class SoccerBallTest {
    public SoccerBall soccerBall;

    @Before
    public void setUp() {
        soccerBall = new SoccerBall();
    }

    @Test
    public void bounceTest() {
        assertEquals(NormalBounce.BOUNCE, soccerBall.performBounce());
    }

    @Test
    public void deflateTest() {
        assertEquals(Deflatable.DEFLATE, soccerBall.performDeflate());
    }

    @Test
    public void inflateTest() {
        assertEquals(Deflatable.INFLATE, soccerBall.performInflate());
    }

    @Test
    public void captureTest() {
        assertEquals(CannotCapture.CAPTURE, soccerBall.performCapture());
    }

    @Test
    public void releaseTest() {
        assertEquals(CannotCapture.RELEASE, soccerBall.performRelease());
    }

    @Test
    public void rollTest() {
        assertEquals("Soccer ball is rolling!", soccerBall.roll());
    }
}

