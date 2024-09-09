import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();

        ArrayList<String> bakeryList = new ArrayList<>();
        bakeryList.add("Bread");
        bakeryList.add("Donut");
        bakeryList.add("Cake");

        ArrayList<String> produceList = new ArrayList<>();
        produceList.add("Lettuce");
        produceList.add("Tomatoes");
        produceList.add("Pineapple");

        ArrayList<String> DrinkList = new ArrayList<>();
        DrinkList.add("Coffee");
        DrinkList.add("Tea");

        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(DrinkList);

        System.out.println(groceryList.get(0).get(0)); //we use the .get to get a specfic part of the list we do it twice to define the index of what specifics we want further so we are calling the first list first item
    }
}
//This is a dynamic list of lists, you can change the size of the list during runtime