public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Boat boat = new Boat();

        Vehicle[] racers = { car, bicycle, boat };
        for(Vehicle v : racers){
            v.go();
        }

    }
}

//polymorphism derving from the greek word for poly, meaning many and morph meaning form
//it's the ability for an object to identify as more than one type