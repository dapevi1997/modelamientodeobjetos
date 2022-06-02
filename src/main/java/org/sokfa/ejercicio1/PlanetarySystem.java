package org.sokfa.ejercicio1;

import java.util.List;
import java.util.UUID;

/**
 *
 * @author dapevi1997
 */
public abstract class PlanetarySystem {

    protected final String id;
    protected String name;
    protected int numberOfBodies;
    

    protected List<SystemBody> bodies;

    public PlanetarySystem() {

        this.id = UUID.randomUUID().toString();
    }

    public abstract void attractionBetweenTwoBodies(Enum Body1, Enum Body2);

    public abstract void showInformation();
    
    

}
