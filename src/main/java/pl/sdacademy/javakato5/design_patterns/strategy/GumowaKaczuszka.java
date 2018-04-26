package pl.sdacademy.javakato5.design_patterns.strategy;

import pl.sdacademy.javakato5.design_patterns.strategy.logic.*;

public class GumowaKaczuszka extends StandardowaKaczka {
    public GumowaKaczuszka() {
        // GumowaKaczuszka has different logic then CyraneczkaKarolinska or KaczkaKrzyzowka, so it is providing different
        // object to StandardowaKaczkas konstructor. Keep in mind, that every object created below contains specific logic
        // for matching operation.
        super(new NieLatam(), new Piszczenie(), new Dryfowanie());
    }
}
