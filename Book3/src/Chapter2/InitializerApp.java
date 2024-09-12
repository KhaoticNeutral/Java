package Chapter2;

import java.util.Scanner;

public class InitializerApp {

    private Scanner sc = new Scanner(System.in);

    // Initializer
    public int x;

    {
        System.out.println("In static initializer.");
        System.out.print(
                "Enter the starting value for x: ");
        x = sc.nextInt();
        System.out.println("You entered " + x);
    }

    // Constructor
    public void Initializer() {
        System.out.println("In constructor now.");
    }

}
