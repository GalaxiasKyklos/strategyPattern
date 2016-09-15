package mx.iteso.strategy.behaviors.impl;

import mx.iteso.strategy.behaviors.CaptureBehavior;

/**
 * Created by Saúl on 14/09/2016.
 */
public class CannotCapture implements CaptureBehavior {
    public static final String CAPTURE = "I cannot capture a pokemon";
    public static final String RELEASE = "I cannot release a pokemon";
    public String capture() {
        return CAPTURE;
    }

    public String release() {
        return RELEASE;
    }
}
