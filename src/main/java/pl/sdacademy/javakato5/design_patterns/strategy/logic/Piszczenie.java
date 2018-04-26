package pl.sdacademy.javakato5.design_patterns.strategy.logic;

/**
 * Logic for object, that are not actually quacking, but instead of that are making screech noise.
 */
public class Piszczenie implements Kwaczacy {
    @Override
    public void kwacz() {
        System.out.println("PIIISK!");
    }
}
