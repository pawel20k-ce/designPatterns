package pl.sdacademy.javakato5.design_patterns.strategy.logic;

/**
 * Logic for objects that cannot actually swim.
 */
public class NieLatam implements Latajacy {
    @Override
    public void lataj() {
        System.out.println("Nie latam");
    }
}
