public class Main {
    public static void main(String[] args) {

        /*int[] numbers = new int[10];
        char[] characters = new char[10];
        String[] words = new String[10];
        This is how you normally declare arrays
        */

        //Food[] fridge = new Food[3];   use this if you want to declare it first

        Food food1 = new Food("pizza");
        Food food2 = new Food("bread");
        Food food3 = new Food("cheese");

        Food[] fridge = {food1, food2, food3};

        /*fridge[0] = food1;
        fridge[1] = food2;
        fridge[2] = food3;*/

        System.out.println(fridge[0].name);
        System.out.println(fridge[1].name);
        System.out.println(fridge[2].name);
    }
}