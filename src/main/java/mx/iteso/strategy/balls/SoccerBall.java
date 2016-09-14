package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.CannotCapture;
import mx.iteso.strategy.behaviors.impl.Deflatable;
import mx.iteso.strategy.behaviors.impl.NormalBounce;

public class SoccerBall extends Ball {
    public SoccerBall() {
        bounceBehavior = new NormalBounce();
        deflateBehavior = new Deflatable();
        captureBehavior = new CannotCapture();
        type = "Soccer ball";
    }
}
