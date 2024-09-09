import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Animal animal;

        System.out.println("Enter the number of the animal: ");
        System.out.print("(1=dog) or (2=cat): ");
        int choice = sc.nextInt();

        if(choice==1){
            animal = new Dog();
            animal.speak();

        }else if(choice==2){
            animal = new Cat();
            animal.speak();
        }else {
            animal = new Animal();
            System.out.println("WRONG");
            animal.speak();
        }
    }
}

//polymorph means many shapes/forms
//dynamic meaning after compilation (during runtime) (after the program compiles)
//for example a ford is a ford and a car and a vehicle and an object
//This is great for if you don't know what object you want yet