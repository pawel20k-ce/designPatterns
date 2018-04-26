package pl.sdacademy.javakato5.design_patterns.builder;

/**
 * Class that contains all ingredients of requested burger. It is designed as Value Object, so it cannot be changed during its lifecycle.
 */
public class Burger {
    /**
     * final field prevents for changing their value after initialization in constructor
     */
    private final BreadType bread;
    private final String meat;
    private final String salad;
    private final String cheese;
    private final String sauce;
    private final boolean withBacon;

    /**
     * The only constructor that is private will prevent from unauthorized creation of Burger objects. The only way to
     * create instance of Burger is to use inner {@link BuilderByJoshuaBloch}, that can be accesed via {@link Burger#builder()} method
     *
     * @param builder that will contain all necessary fields for burger
     */
    private Burger(BuilderByJoshuaBloch builder) {
        this.bread = builder.bread;
        this.meat = builder.meat;
        this.salad = builder.salad;
        this.cheese = builder.cheese;
        this.sauce = builder.sauce;
        this.withBacon = builder.withBacon;
    }

    // getters - NO SETTERS (because of final fields)
    public BreadType getBread() {
        return bread;
    }

    public String getMeat() {
        return meat;
    }

    public String getSalad() {
        return salad;
    }

    public String getCheese() {
        return cheese;
    }

    public String getSauce() {
        return sauce;
    }

    public boolean isWithBacon() {
        return withBacon;
    }

    /**
     * Overriden just to show its content
     *
     * @return
     */
    @Override
    public String toString() {
        return "Burger{" +
                "bread=" + bread +
                ", meat='" + meat + '\'' +
                ", salad='" + salad + '\'' +
                ", cheese='" + cheese + '\'' +
                ", sauce='" + sauce + '\'' +
                ", withBacon=" + withBacon +
                '}';
    }

    /**
     * Only method that is allowed to create BuilderByJoshuaBloch instance. Because it is static, there is no need to create Burger
     * object before calling this method. It can be invoked directly on class.
     *
     * @return new instance of {@link BuilderByJoshuaBloch}
     */
    public static BuilderByJoshuaBloch builder() {
        return new BuilderByJoshuaBloch();
    }

    /**
     * Inner static class that is managing creation of Burger. It is public, because it should be accessible from all parts
     * of application. On the other hand, it has private constructor, because it should be only created using static
     * method from Burger class - {@link Burger#builder()}
     */
    public static class BuilderByJoshuaBloch {
        // Temporary storage for all fields, that burger will contain. Later, those values will be passed to Burgers constructor.
        private BreadType bread;
        private String meat;
        private String salad;
        private String cheese;
        private String sauce;
        private boolean withBacon;

        private BuilderByJoshuaBloch() {
            // If we want to force default values, we can do it inside constructor of BuilderByJoshuaBloch class, e.g:
//            bread = BreadType.WHEAT;
        }

        // every field of builder fields has an corresponding method with (usually) the same name. We want to use fluent
        // interface, so we are returning current instance of BuilderByJoshuaBloch
        public BuilderByJoshuaBloch bread(BreadType bread) {
            // saving provided BreadType value into builder field
            this.bread = bread;
            // returning current instance of builder with "this" keyword
            return this;
        }

        public BuilderByJoshuaBloch meat(String meat) {
            this.meat = meat;
            return this;
        }

        public BuilderByJoshuaBloch salad(String salad) {
            this.salad = salad;
            return this;
        }

        public BuilderByJoshuaBloch cheese(String cheese) {
            this.cheese = cheese;
            return this;
        }

        public BuilderByJoshuaBloch sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public BuilderByJoshuaBloch withBacon(boolean withBacon) {
            this.withBacon = withBacon;
            return this;
        }

        // final operation of builder - build of real Burger class
        public Burger build() {
            // this method could contain logic, that will calculate/create all necessary values needed by Burgers constructor.
            // Burger constructor requires Bulder instance, therefore "this" is returned. Rememeber, that "this" means object
            // in current context - in this code we are in BuilderByJoshuaBloch context, so "this" contains builder instance.
            return new Burger(this);
        }
    }

}
