package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.Deflatable;
import mx.iteso.strategy.behaviors.impl.NormalBounce;

/**
 * Created by Saúl on 14/09/2016.
 */
public class BasketBall extends Ball {
    public BasketBall() {
        bounceBehavior =  new NormalBounce();
        deflateBehavior = new Deflatable();
        type = "Basketball Ball";
    }
}
