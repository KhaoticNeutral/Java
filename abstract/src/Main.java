public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        // vehicle = new Vehicle();

        car.go();

    }
}

//the abstract keyword can be applied both to classes and methods
//classes cannot be initilized but they can have a subclass
//abstract methods are declared without implementation
//it adds a layer of security to your program so that you arent able to make "abtract" objects initiate
//Subclasses have to execute the method instead of the parent class