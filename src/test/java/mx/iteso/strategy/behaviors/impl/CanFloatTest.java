package mx.iteso.strategy.behaviors.impl;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Saúl on 15/09/2016.
 */
public class CanFloatTest {
    @Test
    public void flotationTest() {
        CanFloat canFloat = new CanFloat();
        Assert.assertEquals("I'm floating!", canFloat.flotation());
    }
}
