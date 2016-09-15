package mx.iteso.strategy.behaviors.impl;

import mx.iteso.strategy.behaviors.DeflateBehavior;

public class Deflatable implements DeflateBehavior {
    public static final String DEFLATE = "I'm deflating!";
    public static final String INLFATE = "I'm inflating!";

    public String deflate() {
        return DEFLATE;
    }

    public String inflate() {
        return INLFATE;
    }
}
