package mx.iteso.strategy.behaviors.impl;

import mx.iteso.strategy.behaviors.CaptureBehavior;

/**
 * Created by Saúl on 14/09/2016.
 */
public class CanCapture implements CaptureBehavior {
    public String capture() {
        return "I've captured a pokemon!";
    }

    public String release() {
        return "I've released the pokemon";
    }
}
