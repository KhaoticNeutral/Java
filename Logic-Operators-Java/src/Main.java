import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        int temp = 15;

        if(temp > 30){
            System.out.println("It is hot!");
        }else if(temp >= 20 && temp <= 30){
            System.out.println("It is warm!");
        }else{
            System.out.println("It is cold, freeze");
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("You're playing a game press Q to exit");
        String response = sc.next();

        if(response.equals("Q") || response.equals("q")){
            System.out.println("Thank you for playing!");
        }else{
            System.out.println("You are playing pew pew");
        }

        if(!response.equals("Q") && !response.equals("q")){
            System.out.println("Thanks for staying!");
        }else{
            System.out.println("You are not playing pew pew");
        }

    }
}

//logic operators are used to connect two or more expressions
//these are your && both conditions must be true
//|| either consdition must be true
// ! reverses boolean value of the condition