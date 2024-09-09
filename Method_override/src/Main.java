public class Main {
    public static void main(String[] args) {

        dog dog = new dog();
        animal animal = new animal();

        dog.speak();
        animal.speak();

    }
}

//Method overriding is when you declare a method in the subclass which is already present in the parent class.
//this is done so the child class can give it's own implimentation