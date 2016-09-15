package mx.iteso.strategy.behaviors.impl;

import mx.iteso.strategy.behaviors.DeflateBehavior;

public class NotDeflatable  implements DeflateBehavior{
    public static final String DEFLATE = "I can't deflate!";
    public static final String INFLATE = "I can't inflate!";
    public String deflate() {
        return DEFLATE;
    }

    public String inflate() {
        return INFLATE;
    }
}
