package mx.iteso.strategy.behaviors.impl;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Saúl on 15/09/2016.
 */
public class CannotFloatTest {
    @Test
    public void flotationTest() {
        CannotFloat cannotFloat = new CannotFloat();
        Assert.assertEquals("I cannot float", cannotFloat.flotation());
    }
}
