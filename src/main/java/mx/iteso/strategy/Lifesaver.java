package mx.iteso.strategy;

import mx.iteso.strategy.behaviors.DeflateBehavior;
import mx.iteso.strategy.behaviors.FlotationCapacity;

public abstract class Lifesaver {
    public String type;
    public DeflateBehavior deflateBehavior;
    public FlotationCapacity flotationCapacity;

    public String inflating() {
        return deflateBehavior.inflate();
    }
    public String deflating() {
        return deflateBehavior.deflate();
    }
    public String floating() {
        return flotationCapacity.flotation();
    }
    public String display() {
        return "I'm a " + type;
    }
}
