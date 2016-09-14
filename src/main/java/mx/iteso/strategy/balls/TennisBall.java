package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.CannotCapture;
import mx.iteso.strategy.behaviors.impl.NormalBounce;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;

/**
 * Created by Saúl on 14/09/2016.
 */
public class TennisBall extends Ball {
    public TennisBall() {
        bounceBehavior =  new NormalBounce();
        deflateBehavior = new NotDeflatable();
        captureBehavior = new CannotCapture();
        type = "Tennis ball";
    }
}
