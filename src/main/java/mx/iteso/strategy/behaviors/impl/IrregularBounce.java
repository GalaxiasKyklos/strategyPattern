package mx.iteso.strategy.behaviors.impl;

import mx.iteso.strategy.behaviors.BounceBehavior;

public class IrregularBounce implements BounceBehavior {
    public static final String BOUNCE = "I'm bouncing irregularly!";
    public String bounce() {
        return BOUNCE;
    }
}
