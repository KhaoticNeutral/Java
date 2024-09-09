public class Main {
    public static void main(String[] args) {

        Human human = new Human("Tobais Mayhern", 65, 165.09);
        Human human1 = new Human("Mavis Mayhern", 55, 60.05);
        Human human2 = new Human("Lenard Mayhern", 83, 160);

        human1.eat();
        human.drink();
        human2.sleep();

        human.weight();
        human1.weight();
        human2.weight();

        human.age();
        human2.age();
        human1.age();

    }
}
//constructor is a special method that is called when an object is instantion (created)
//constructors can also take arguments
//parsing arguments to constructors allow you to make unique gobjects