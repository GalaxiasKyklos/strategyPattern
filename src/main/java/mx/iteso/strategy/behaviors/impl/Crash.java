package mx.iteso.strategy.behaviors.impl;

import mx.iteso.strategy.behaviors.BounceBehavior;

public class Crash implements BounceBehavior {
    public static final String BOUNCE = "I crashed!! I can't bounce";
    public String bounce() {
        return BOUNCE;
    }

}
