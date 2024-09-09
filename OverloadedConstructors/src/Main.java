public class Main {
    public static void main(String[] args) {

        Pizza pizza = new Pizza("Thicc crust", "Pesto", "Mushrooms", "Mozz");
        System.out.println("Pizza order: ");
        System.out.println(pizza.base);
        System.out.println(pizza.sauce);
        System.out.println(pizza.topping);
        System.out.println(pizza.cheese);
    }
    
}

//Overloaded Constructors
//multiple constructors within a class with the same name
//but have diffrent parameters
//name + parameters = signiture (the signiture is what makes them unique like people can share the same name but not the same signiture)
