package mx.iteso.strategy.behaviors.impl;

import mx.iteso.strategy.behaviors.BounceBehavior;

public class NormalBounce implements BounceBehavior {
    public static final String BOUNCE = "I'm bouncing normally!";

    public String bounce() {
        return BOUNCE;
    }
}
