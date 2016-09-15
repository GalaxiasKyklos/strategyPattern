package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.Lifesaver;
import mx.iteso.strategy.behaviors.impl.CannotFloat;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;

/**
 * Created by Saúl on 15/09/2016.
 */
public class LifesaverCandies extends Lifesaver {
    public LifesaverCandies() {
        deflateBehavior = new NotDeflatable();
        flotationCapacity = new CannotFloat();
        type = "Lifesaver Candy";
    }
}
