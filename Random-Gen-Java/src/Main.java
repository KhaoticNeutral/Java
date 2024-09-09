import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();

        int x = rand.nextInt(100)+1;
        double y = rand.nextDouble();
        boolean b = rand.nextBoolean();

        System.out.println(x);


    }
}

//this does not actually produce true randome values it makes sudo-random values