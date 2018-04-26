package pl.sdacademy.javakato5.design_patterns.strategy;

import pl.sdacademy.javakato5.design_patterns.strategy.logic.Kwaczacy;
import pl.sdacademy.javakato5.design_patterns.strategy.logic.Latajacy;
import pl.sdacademy.javakato5.design_patterns.strategy.logic.Plywajacy;

/**
 * Abstract class that is composing duck logic linked with flying, quacking and swimming. Logic for those operation may
 * vary depending on that, which implementation will be provided (every operation has at least 2 different classes that
 * are responsible for executing this operation).
 *
 * Logic for execution on {@link #lataj()}, {@link #kwacz()} and {@link #plywaj()} methods is provided through constructor
 * of this class. All clases, that are extending this class, must provide objects with logic applicable for them.
 */
public abstract class StandardowaKaczka implements Kaczka {
    /**
     * Fields for logic of specific operations.
     */
    private final Latajacy latanie;
    private final Kwaczacy kwakanie;
    private final Plywajacy plywanie;

    /**
     * Constructor, that is able to save duck-specific logic.
     * @param latanie - {@link pl.sdacademy.javakato5.design_patterns.strategy.logic.LatanieNaSkrzydlach} or {@link pl.sdacademy.javakato5.design_patterns.strategy.logic.NieLatam}
     * @param kwakanie - {@link pl.sdacademy.javakato5.design_patterns.strategy.logic.StandardoweKwakanie} or {@link pl.sdacademy.javakato5.design_patterns.strategy.logic.Piszczenie}
     * @param plywanie - {@link pl.sdacademy.javakato5.design_patterns.strategy.logic.PlywanieNaWodzie} or {@link pl.sdacademy.javakato5.design_patterns.strategy.logic.Dryfowanie}
     */
    protected StandardowaKaczka(Latajacy latanie, Kwaczacy kwakanie, Plywajacy plywanie) {
        this.latanie = latanie;
        this.kwakanie = kwakanie;
        this.plywanie = plywanie;
    }

    /**
     * Executes latanie. This method is using logic that is stored in "latanie" variable, which was provided through constructor.
     */
    @Override
    public void lataj() {
        latanie.lataj();
    }

    /**
     * Executes kwakanie. This method is using logic that is stored in "kwakanie" variable, which was provided through constructor.
     */
    @Override
    public void kwacz() {
        kwakanie.kwacz();
    }


    /**
     * Executes plywanie. This method is using logic that is stored in "plywanie" variable, which was provided through constructor.
     */
    @Override
    public void plywaj() {
        plywanie.plywaj();
    }
}
