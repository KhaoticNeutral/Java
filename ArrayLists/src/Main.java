import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> food = new ArrayList<>();
        food.add("Apple");
        food.add("Banana");
        food.add("Bread");

        food.set(0, "Pizza"); //this method works like the replace method but for ArrayLists, we first selected the index then what we wanted it to be replaced with
        food.remove(1); //this removes something from your list
        food.clear();//This will just remove everything


        for(int i=0; i < food.size(); i++){
            System.out.println(food.get(i));
        }

    }
}

//An ArrayList is a resizeable array Elements can be added and removed after completion phase, it can also store refrence data types