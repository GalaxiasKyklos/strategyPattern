package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.Crash;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;

/**
 * Created by Saúl on 14/09/2016.
 */
public class BilliardBall extends Ball {
    public BilliardBall() {
        bounceBehavior =  new Crash();
        deflateBehavior = new NotDeflatable();
        type = "Billiard ball";
    }
}
