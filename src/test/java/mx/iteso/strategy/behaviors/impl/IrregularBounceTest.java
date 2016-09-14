package mx.iteso.strategy.behaviors.impl;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Saúl on 14/09/2016.
 */
public class IrregularBounceTest {
    @Test
    public void bounceTest() {
        IrregularBounce irregularBounce = new IrregularBounce();
        Assert.assertEquals("I'm bouncing irregularly!", irregularBounce.bounce());
    }
}
