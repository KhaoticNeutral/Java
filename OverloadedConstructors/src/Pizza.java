public class Pizza {

    String base;
    String sauce;
    String topping;
    String cheese;

    Pizza(String base, String sauce, String topping, String cheese) {
        this.base = base;
        this.sauce = sauce;
        this.topping = topping;
        this.cheese = cheese;
    }

    Pizza(String base, String sauce, String cheese) {
        this.base = base;
        this.sauce = sauce;
        this.cheese = cheese;
    }

    Pizza(String base, String sauce) {
        this.base = base;
        this.sauce = sauce;
    }

    Pizza(String base) {
        this.base = base;
    }


}
