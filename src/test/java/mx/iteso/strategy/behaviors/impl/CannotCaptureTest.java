package mx.iteso.strategy.behaviors.impl;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Saúl on 14/09/2016.
 */
public class CannotCaptureTest {
    @Test
    public void captureTest() {
        CannotCapture cannotCapture = new CannotCapture();
        Assert.assertEquals("I cannot capture a pokemon", cannotCapture.capture());
    }

    @Test
    public void releaseTest() {
        CannotCapture cannotCapture = new CannotCapture();
        Assert.assertEquals("I cannot release a pokemon", cannotCapture.release());
    }
}
