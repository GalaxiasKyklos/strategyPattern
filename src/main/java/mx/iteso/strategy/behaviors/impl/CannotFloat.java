package mx.iteso.strategy.behaviors.impl;

import mx.iteso.strategy.behaviors.FlotationCapacity;
import sun.plugin2.os.windows.FLASHWINFO;

/**
 * Created by Saúl on 15/09/2016.
 */
public class CannotFloat implements FlotationCapacity {
    public static final String FLOAT = "I cannot float";
    public String flotation() {
        return FLOAT;
    }
}
