package pl.sdacademy.javakato5.design_patterns.strategy.logic;

public class PlywanieNaWodzie implements Plywajacy {
    @Override
    public void plywaj() {
        System.out.println("Przebieram pletwami w wodze");
    }
}
