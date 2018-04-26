package pl.sdacademy.javakato5.design_patterns.strategy.logic;

/**
 * Specific swimming logic, that is applicable for objects, that are floating instead of actively swimming.
 */
public class Dryfowanie implements Plywajacy {
    @Override
    public void plywaj() {
        System.out.println("Unoszę się na tafli jeziora niczym kwiat lotosu");
    }
}
