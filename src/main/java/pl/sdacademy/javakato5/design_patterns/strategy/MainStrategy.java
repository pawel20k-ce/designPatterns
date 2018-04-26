package pl.sdacademy.javakato5.design_patterns.strategy;

import java.util.ArrayList;
import java.util.List;

public class MainStrategy {
    public static void main(String[] args) {
        // every specific Duck is also a "Kaczka", so we are assigning them into Kaczka variables
        Kaczka kaczka1 = new CyraneczkaKarolinska();
        Kaczka kaczka2 = new KaczkaKrzyzowka();
        Kaczka kaczka3 = new GumowaKaczuszka();

        // Storing all ducks in a list - it will be easier to process
        List<Kaczka> kaczki = new ArrayList<>();
        kaczki.add(kaczka1);
        kaczki.add(kaczka2);
        kaczki.add(kaczka3);

        // invoking operations on all ducks
        for (Kaczka kaczka : kaczki) {
            kaczka.kwacz();
            kaczka.plywaj();
            kaczka.lataj();
        }
    }
}
