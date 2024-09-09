import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("enter a whole number to divide: ");
            int a = sc.nextInt();

            System.out.println("enter a whole number to divide by: ");
            int b = sc.nextInt();

            int c = a / b;

            System.out.println("result: " + c);

        }catch (ArithmeticException d) {
            System.out.println("You cant divide by zero");
        }catch (InputMismatchException e) {
            System.out.println("You cant divide by that");
        }finally {
            System.out.println("This will always print");
        }
    }
}

//exceptions occur during an execusion of a program that distrubs the normal flow of instructions
//unexpected occurances that mess with your program
//if you were to divide by 0 this is known as an arithmatic exception (math exception)
//YOU CAN catch all exceptions by just using Exception then the name of the exception name
//when you do an all catch exception people usually add in the println "something went wrong"
//cacth all exception is usually for an exceptions you dont think you would have caught, lazy to use a catch all eception and its better practice to use specific exceptions
//The finally block is used to close any scanners that might have been left open and it's good practice to add it to the end