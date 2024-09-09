public class Main {
    public static void main(String[] args) {

        Garage garage = new Garage();
        Cars cars = new Cars("BMW");
        Cars cars2 = new Cars("Audi");


        garage.park(cars);
        garage.park(cars2);

    }
}