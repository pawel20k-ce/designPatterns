package pl.sdacademy.javakato5.design_patterns.strategy.logic;

/**
 * Flying logic that is using wings for flying.
 */
public class LatanieNaSkrzydlach implements Latajacy {
    @Override
    public void lataj() {
        System.out.println("Rozkladam skrzydla i lece");
    }
}
