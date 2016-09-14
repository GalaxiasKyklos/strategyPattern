package mx.iteso.strategy.behaviors.impl;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Saúl on 14/09/2016.
 */
public class NotDeflatableTest {
    @Test
    public void deflateTest() {
        NotDeflatable notDeflatable = new NotDeflatable();
        Assert.assertEquals("I can't deflate!", notDeflatable.deflate());
    }

    @Test
    public void inflateTest() {
        NotDeflatable notDeflatable = new NotDeflatable();
        Assert.assertEquals("I can't inflate!", notDeflatable.inflate());
    }
}
