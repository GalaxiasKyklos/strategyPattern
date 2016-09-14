package mx.iteso.strategy.balls;

import mx.iteso.strategy.behaviors.CaptureBehavior;

/**
 * Created by Saúl on 14/09/2016.
 */
public class CannotCapture implements CaptureBehavior {
    public String capture() {
        return "I cannot capture a pokemon";
    }

    public String release() {
        return "I cannot release a pokemon";
    }
}
