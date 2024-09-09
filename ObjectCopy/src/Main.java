public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Ford", "Fiego", 2019);
        //Car car2 = new Car("BMW", "Hatchback", 2020);

        //car2 = car1 this is not copying it over you are simply stating that now car1 has two diffrent names, common mistake

        //car2.copy(car1); //so now they have diffrent addresses and they have now copied but this is afterwards
        Car car2 = new Car(car1); //this is doing it while instatiating the car2

        System.out.println(car1);
        System.out.println(car2);
        System.out.println();
        System.out.println(car1.getModel());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());
        System.out.println();
        System.out.println(car2.getMake());
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());

    }
}