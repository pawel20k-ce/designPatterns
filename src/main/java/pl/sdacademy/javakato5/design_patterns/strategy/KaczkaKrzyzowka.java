package pl.sdacademy.javakato5.design_patterns.strategy;

import pl.sdacademy.javakato5.design_patterns.strategy.logic.LatanieNaSkrzydlach;
import pl.sdacademy.javakato5.design_patterns.strategy.logic.PlywanieNaWodzie;
import pl.sdacademy.javakato5.design_patterns.strategy.logic.StandardoweKwakanie;

public class KaczkaKrzyzowka extends StandardowaKaczka {

    public KaczkaKrzyzowka() {
        super(new LatanieNaSkrzydlach(), new StandardoweKwakanie(), new PlywanieNaWodzie());
    }
}
