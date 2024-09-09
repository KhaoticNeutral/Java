public class Main {
    public static void main(String[] args) {

        int age = 14;

        if(age >= 75) {
            System.out.println("You are old!");
        }else if(age >= 18){
            System.out.println("You're an adult!");
        } else if (age >= 13) {
            System.out.println("You are a teenager!");
        }else{
            System.out.println("You are a child!");
        }

    }
}

//with the use of greater than or equal to comparison operators we have a couple others
//for example == the double equal signs ask if the values are the same regardless if their diffrent varibles such as a string and an int
//however === compares and sees if something is the same down to their varible types