package mx.iteso.strategy.behaviors.impl;

import mx.iteso.strategy.behaviors.CaptureBehavior;

/**
 * Created by Saúl on 14/09/2016.
 */
public class CanCapture implements CaptureBehavior {
    public static final String CAPTURE = "I've captured a pokemon!";
    public static final String RELEASE = "I've released the pokemon";

    public String capture() {
        return CAPTURE;
    }

    public String release() {
        return RELEASE;
    }
}
