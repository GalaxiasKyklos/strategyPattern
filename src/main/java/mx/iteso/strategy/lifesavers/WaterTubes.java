package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.Lifesaver;
import mx.iteso.strategy.behaviors.impl.CanFloat;
import mx.iteso.strategy.behaviors.impl.Deflatable;

/**
 * Created by Saúl on 15/09/2016.
 */
public class WaterTubes extends Lifesaver {
    public WaterTubes() {
        deflateBehavior = new Deflatable();
        flotationCapacity = new CanFloat();
        type = "Water Tube";
    }
}
