package mx.iteso.strategy.behaviors.impl;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Saúl on 14/09/2016.
 */
public class CanCaptureTest {
    @Test
    public void captureTest() {
        CanCapture captureTest = new CanCapture();
        Assert.assertEquals("I've captured a pokemon!", captureTest.capture());
    }

    @Test
    public void releaseTest() {
        CanCapture captureTest = new CanCapture();
        Assert.assertEquals("I've released the pokemon", captureTest.release());
    }
}
