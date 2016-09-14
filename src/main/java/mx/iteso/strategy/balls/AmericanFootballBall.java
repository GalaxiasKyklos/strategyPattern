package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.CannotCapture;
import mx.iteso.strategy.behaviors.impl.Deflatable;
import mx.iteso.strategy.behaviors.impl.IrregularBounce;

public class AmericanFootballBall extends Ball {
    public AmericanFootballBall() {
        bounceBehavior =  new IrregularBounce();
        deflateBehavior = new Deflatable();
        captureBehavior = new CannotCapture();
        type = "American Football ball";
    }
}
