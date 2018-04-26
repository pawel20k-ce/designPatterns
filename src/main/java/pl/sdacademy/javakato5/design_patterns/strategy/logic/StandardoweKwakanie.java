package pl.sdacademy.javakato5.design_patterns.strategy.logic;

/**
 * Logic for objects that can quack.
 */
public class StandardoweKwakanie implements Kwaczacy {
    @Override
    public void kwacz() {
        System.out.println("Kwa Kwa!");
    }
}
