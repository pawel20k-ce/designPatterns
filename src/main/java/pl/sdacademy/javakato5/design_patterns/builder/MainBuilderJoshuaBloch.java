package pl.sdacademy.javakato5.design_patterns.builder;

public class MainBuilderJoshuaBloch {

    public static void main(String[] args) {
        // Obtaining an instance of Burger builder. We are using static method named "builder" from Burger class,
        // and assigning it to the Burger.BuilderByJoshuaBloch type. BuilderByJoshuaBloch is inner class of Burger, therefore we need to point to
        // it with "." character -> Burger(dot)BuilderByJoshuaBloch
        Burger.BuilderByJoshuaBloch burgerBuilder = Burger.builder();
        // We are using fluent interface to provide all information about burger that we want to make - methods are
        // invoked in order that we wrote them, however BuilderByJoshuaBloch should never be dependent on this order. Any logic, that
        // is needed to be done before burger creation (e.g. some additional calculation or parameters processing) - so
        // in the build method
        Burger myBurger = burgerBuilder
                .bread(BreadType.WHEAT)
                .cheese("masdaamer")
                .meat("beef")
                .salad("bio lettuce")
                .sauce("cesar")
                .withBacon(true).build();
        System.out.println(myBurger);
    }
    /*
    public static void main(String[] args) {
        // alternative usage - there is no need to assign builder to variable, it can be used directly
        Burger myBurger = Burger.builder()
                .bread(BreadType.WHEAT)
                .cheese("masdaamer")
                .meat("beef")
                .salad("bio lettuce")
                .sauce("cesar")
                .withBacon(true).build();
        System.out.println(myBurger);
    }
    */
}
