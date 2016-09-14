package mx.iteso.strategy.behaviors.impl;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Saúl on 14/09/2016.
 */
public class NormalBounceTest {
    @Test
    public void bounceTest() {
        NormalBounce normalBounce = new NormalBounce();
        Assert.assertEquals("I'm bouncing normally!", normalBounce.bounce());
    }
}
