import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //String[] animals = {"cat", "dog", "rat", "pig"};
        ArrayList<String> animals = new ArrayList<String>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Cow");
        animals.add("Sheep");

        for(String i : animals){ //this is saying for each index in our array of animals hence a for each loop
                System.out.println(i);
        }

    }
}

//For each loops loops through the elements in an array or collection
//genrally used because it has less steps and is more readable
//however it is less flexable