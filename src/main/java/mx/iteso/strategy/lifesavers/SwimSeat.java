package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.Lifesaver;
import mx.iteso.strategy.behaviors.impl.CanFloat;
import mx.iteso.strategy.behaviors.impl.Deflatable;

public class SwimSeat extends Lifesaver {
    public SwimSeat() {
        deflateBehavior = new Deflatable();
        flotationCapacity = new CanFloat();
        type = "Swim seat";
    }
}
