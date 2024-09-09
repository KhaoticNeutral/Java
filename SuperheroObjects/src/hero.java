public class hero extends person{

    String superpower;

    hero(String name, int age, String superpower) {
            super(name, age); //calling the parent class
            this.superpower = superpower;
    }

    public String toString() {
        return super.toString()+this.superpower;
    }
}
