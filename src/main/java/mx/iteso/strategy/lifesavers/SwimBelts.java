package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.Lifesaver;
import mx.iteso.strategy.behaviors.impl.CanFloat;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;

/**
 * Created by Saúl on 15/09/2016.
 */
public class SwimBelts extends Lifesaver {
    public SwimBelts() {
        deflateBehavior = new NotDeflatable();
        flotationCapacity = new CanFloat();
        type = "Swim Belt";
    }
}
