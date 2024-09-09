import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double x;
        double y;
        double z;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter X: ");
        x = scan.nextDouble();
        System.out.println("Enter Y: ");
        y = scan.nextDouble();

        z = Math.sqrt((x*x)+(y*y));
        System.out.println("The Hypotenuse is: "+z);

        scan.close();
    }
}

//math.max compares two numbers to see which one is larger
//math.abs is the absolute value which shows it without positive or negative values just the plain old value
//math.sqrt is the square root
//math.round rounds the number to the closest value
//math.ceil will always round up
//math.floor will always round down