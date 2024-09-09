public class Main {
    public static void main(String[] args) {

        Car car = new Car();

        System.out.println(car.toString()); //explicityly
        System.out.println(car); //implicitly
    }
}
//toString() is a special method that all objects inherit, it returns a string that "Textually represents" an object
//can be used both implicity and explicity