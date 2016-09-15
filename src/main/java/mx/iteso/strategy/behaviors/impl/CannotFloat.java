package mx.iteso.strategy.behaviors.impl;

import mx.iteso.strategy.behaviors.FlotationCapacity;

/**
 * Created by Saúl on 15/09/2016.
 */
public class CannotFloat implements FlotationCapacity {
    public String flotation() {
        return "I cannot float";
    }
}
