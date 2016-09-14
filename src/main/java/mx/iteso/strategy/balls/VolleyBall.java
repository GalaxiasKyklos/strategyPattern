package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.Deflatable;
import mx.iteso.strategy.behaviors.impl.NormalBounce;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;

/**
 * Created by Saúl on 14/09/2016.
 */
public class VolleyBall extends Ball {
    public VolleyBall() {
        bounceBehavior =  new NormalBounce();
        deflateBehavior = new Deflatable();
        type = "VolleyBall ball";
    }
}
