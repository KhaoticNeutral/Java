public class Main {
    public static void main(String[] args) {

        Car car = new Car("Ford", "fiego", 2017);
        //System.out.println(car.make); this can't happen because we've made this private
        //but to get it you use a getter and setter method

        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());

        //see now we can get it
        //lets change it now

        //car.year = 2019 this won't work because it's still private

        car.setYear(2019);
        System.out.println(car.getYear());

        //the setter has now changed it

    }
}

//Encapsulation are attributes of a class will be hidden or private
//Can be accessed only through methods (getters and setters)
//you should make attributes private if you dont have a reason to make them public/protected