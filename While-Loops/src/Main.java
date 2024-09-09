import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan  = new Scanner(System.in);
        String name = "";

         do{
            System.out.print("Enter your name");
            name = scan.nextLine();
        }while(name.isBlank());
        System.out.println("Your name is " + name);
    }
}

//while loops will execute a block of code as long as the condition is true
//do loops very similar to the while loop will execute the block of code at least once and then check the condition