package mx.iteso.strategy.balls;

import mx.iteso.strategy.behaviors.impl.CannotCapture;
import mx.iteso.strategy.behaviors.impl.NormalBounce;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Rodolfo on 15/09/2016.
 */
public class TennisBallTest {
    public TennisBall tennisBall;

    @Before
    public void setUp() {
        tennisBall = new TennisBall();
    }

    @Test
    public void bounceTest() {
        assertEquals(NormalBounce.BOUNCE, tennisBall.performBounce());
    }

    @Test
    public void deflateTest() {
        assertEquals(NotDeflatable.DEFLATE, tennisBall.performDeflate());
    }

    @Test
    public void inflateTest() {
        assertEquals(NotDeflatable.INFLATE, tennisBall.performInflate());
    }

    @Test
    public void captureTest() {
        assertEquals(CannotCapture.CAPTURE, tennisBall.performCapture());
    }

    @Test
    public void releaseTest() {
        assertEquals(CannotCapture.RELEASE, tennisBall.performRelease());
    }

    @Test
    public void rollTest() {
        assertEquals("Tennis ball is rolling!", tennisBall.roll());
    }
}