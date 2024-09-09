public class Main {
    public static void main(String[] args) {

        hero hero1 = new hero("Batman", 42, "wealthy");
        hero hero2 = new hero("Superman", 42, "Lots");

        //System.out.println(hero1.toString());
        System.out.println(hero2);
    }
}

//super key word refers to the superclass (parent class) of an object
//very similar to the .this keyword