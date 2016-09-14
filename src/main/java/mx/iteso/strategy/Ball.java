package mx.iteso.strategy;

import mx.iteso.strategy.behaviors.BounceBehavior;
import mx.iteso.strategy.behaviors.CaptureBehavior;
import mx.iteso.strategy.behaviors.DeflateBehavior;

public abstract class Ball {

    public BounceBehavior bounceBehavior;
    public DeflateBehavior deflateBehavior;
    public CaptureBehavior captureBehavior;
    public String type;

    public Ball() {
    }

    public void setBounceBehavior(BounceBehavior bounceBehavior) {
        this.bounceBehavior = bounceBehavior;
    }

    public void setDeflateBehavior(DeflateBehavior deflateBehavior) {
        this.deflateBehavior = deflateBehavior;
    }

    public BounceBehavior getBounceBehavior() {
        return this.bounceBehavior;
    }

    public DeflateBehavior getDeflateBehavior() {
        return this.deflateBehavior;
    }

    public String roll() {
        return type + " is rolling!";
    }

    public String performBounce() {
        return bounceBehavior.bounce();
    }

    public String performDeflate() {
        return deflateBehavior.deflate();
    }

    public String performInflate() {
        return deflateBehavior.inflate();
    }

    public String performCapture() { return captureBehavior.capture(); }

    public String performRelease() { return captureBehavior.release(); }

}
