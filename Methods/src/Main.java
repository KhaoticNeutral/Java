public class Main {
    public static void main(String[] args) {

        //this is a method that we've been working in the entire time it's the main method
        //lets make a new one
        //String name = "Victor";
        //int age = 18;
        //hello(name, age); //this is how you call a method

        int x = 3;
        int y = 5;

        System.out.println(add(x, y));
    }

    /*static void hello (String name, int age) { //here is our argument and parameter
        System.out.println("Hello " + name);
        System.out.println("Age " + age);
    }*/

    static int add(int x, int y) {

        return x + y;
    }
}

//method is a block of code that is executed whenever it's called
//we can also parse the method more information when we call it within the parenthsies for example adding a string of your name
//when putting something inside of those parenthsies thats known as an argument but like with every good argument you need paremeters to which the argument abides by

//return types
//This can return two values and is not set as void rather just static int and then your methods name
//You call upon this return using return();