package pl.sdacademy.javakato5.design_patterns.strategy;

import pl.sdacademy.javakato5.design_patterns.strategy.logic.*;

/**
 * One of the specific ducks. It can fly, quack and swim.
 */
public class CyraneczkaKarolinska extends StandardowaKaczka {

    /**
     * Constructor of CyraneczkaKarolinska, which is using constructor from StandardowaKaczka class. It is providing
     * logic for generic class, that will use it in specific methods.
     */
    public CyraneczkaKarolinska() {
        // super() is invoking matching constructor in extended class. Order of parameters matters.
        super(new LatanieNaSkrzydlach(), new StandardoweKwakanie(), new PlywanieNaWodzie());
        // each created object is providing some specific logic, that StandardowaKaczka is using
    }
}
