package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.Lifesaver;
import mx.iteso.strategy.behaviors.impl.CanFloat;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;

/**
 * Created by Saúl on 15/09/2016.
 */
public class FoamFloats extends Lifesaver {
    public FoamFloats() {
        deflateBehavior = new NotDeflatable();
        flotationCapacity = new CanFloat();
        type = "Foam Float";
    }
}
