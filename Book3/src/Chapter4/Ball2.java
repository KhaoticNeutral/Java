package Chapter4;

public class Ball2 {

    public double weight;
    public double diameter;

    public Ball2(double weight, double diameter) {
        this.weight = weight;
        this.diameter = diameter;
        System.out.println("Hello from the BALL constructor.");
    }
    public Ball2(double weight) {
        this.weight = weight;
        this.diameter = 5;
        System.out.println("Hello from the BALL constructor.");
    }

    public Ball2() {
        this.weight = 3;
        this.diameter = 3;
        System.out.println("Hello from the BALL constructor.");
    }

    @Override
    public String toString() {
        return "Ball weight: " + this.weight + " and diameter: " + this.diameter;
    }
    public void throwBall() {
        System.out.println("Throwing the ball.");
    }
}

class BaseBall2 extends Ball2 {
    // It will first call the constructor of the superclass then its own constructor.
    public BaseBall2(double weight) {
        // super MUST BE THE VERY FIRST THING YOU CALL OR YOU WILL GET AN ERROR!
        super(weight);
        System.out.println("Howdy from the BASEBALL constructor.");
    }
    public BaseBall2() {
        super(5);
    }
    public static void hit(BaseBall2 baseball) {
        System.out.println("I am hitting a baseball.");
    }
}

class SoftBall2 extends Ball2 {

    public SoftBall2(double weight, double diameter) {
        super(weight, diameter);
        System.out.println("Hey from the SOFTBALL constructor.");
    }
    public SoftBall2(double weight) {
        super(weight);
        System.out.println("Hey from the SOFTBALL constructor.");
    }

    public SoftBall2() {
        // super MUST BE THE VERY FIRST THING YOU CALL OR YOU WILL GET AN ERROR!
        super(2);
        System.out.println("Hey from the SOFTBALL constructor.");
    }
}



