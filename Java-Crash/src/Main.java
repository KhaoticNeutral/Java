import java.util.Scanner;  //this is a package in the jdk that allows user input


public class Main {
    public static void main(String[] args){

        System.out.println("I love Thai Sweet Chillie chips");
        System.out.println("Its so good!");

        int x; //decleration
        x = 123; //asignment
        int y = 143; //initilization
        System.out.println(x); //notice how we don't have to put the varible in qoutes
        System.out.println("My Number is: "+y); //though we can add the two but still the varible stays out of the string.
        //adding the string and the varible is a form of conconation

        long z = 123456789123456789L; //when declaring a long type always finish your number with a captial L
        System.out.println("The Debt that I owe is: "+z);

        byte w = 100; //this can only store until 125 so its not used very often
        short d= 200; //Shorts also don't store large amounts of data so again rarely used

        float r= 12.02f; //floats can store decimals, however much like the long they require a lowercase f at the end
        System.out.println("I am "+r+" years old!");

        double c= 655.344000; //can store up to 15 spaces after the decimal and doesn't need the f so its more commonly used
        System.out.println("I am "+c+" seconds old!");

        boolean b= true; //this can hold either true or false, most often used to determine wether or not consitions were met. But we can also just print it.
        char symbol = '@'; //this is a reference data type the string so to speak, is held in single qoutes
        String name = "Victor"; //an actual string not a character, that's what chars short for
        System.out.println("I am "+name);

        //we can aslo change varibles and their values

        String a = "Water";
        String e = "Kool-aid";
        String temp; //This is the same as assigning it to null, as you can see we don't always have to create code with initilization, sometines we'll use the two seperate steps in this case to swop the two values

        //a=e; //as you can see we have now said that "a" is equal to the value of "e", this will make a = Kool-Aid
        //e=a; //This will say that Kool-aid (e) is now equal to water
        //But then how do we switch them? Add a third variable, temp

        temp = a;
        a=e;
        e = temp; // and then you have now successfully swopped two variables

        System.out.println("a: "+a);
        System.out.println("e: "+e);

        Scanner sc = new Scanner(System.in); //allows for user input
        System.out.println("what's your name?: "); //the value gets inputted by the user
        String Fname = sc.nextLine(); //we assign that value a variable

        System.out.println("Hello "+Fname); //we can then use that value and conconate it with a string
        //now this is not limited to only strings you can really use any variable we can also use stuff like int

        Scanner sc1 = new Scanner(System.in);
        System.out.println("What's your age?: ");
        int age = sc1.nextInt();
        sc1.nextLine();
        System.out.println("You're only "+age+" years old!");
        //if you were to type in a string for example instead of an int you'd get an exception error, which means they don't match and therefore the code cant be executed

        System.out.println("What is your favorite color?");
        String color = sc1.nextLine();
        System.out.println("You like: "+color); //when you run it in this order you'll notice that the user never gets to input anything
        //This happened because we used an INT, when a scanner reads an inout your enter key acts as an \n, but when using an INT unlike a string, it doesn't need to know when a sentance stops because it's a number so the \n stays and then because we
        //introduced a string again it simply skipped over it
        //Lets try again, refer back to line 60, we added another next line so it gets rid of that \n allowing us to input a value again, and then we'll be able to answer all the questions


        //Now lets move onto expressions.
        // expressions = operands and operators
        //operands = values, variables, numbers, quantity, you can remember them such as rands money, so it obviously has mostly to do with numbers
        //operators = + - * / % the mathematical functions you can use with your amounts
        //remember however you can also use these with VARIABLES so that too can include strings and chars

        double friends = 10;
        friends = friends - 1;
        System.out.println("You have "+friends+" friends"); //you can do this with any of the mathematical operations in the same format
        //special note though % this will help you find the remainder diffrent from division it's known as a modular
        //we can also increment
        friends++; //you can also deincrement by using --
        System.out.println("You have "+friends+" friends");
        //keep in mind when you use the division it will not produce a remainder or decimal, for example if you divide 10 by 3 it will not output 3.33 it will output 3
        //if you want that remainder it would look something like this
        friends = (double) friends / 3;
        System.out.println("You have "+friends+" friends");

        //Let's now build a basic graphical user interface (GUI)
        //but for this we'll need a diffrent project

    }
}
/* Working with strings
escape sequence \n (when used with println it'll create an additional empty line)
 \t will create a space before the text is executed
If you need qoutes in your text it'll look like "\"text here\""
backslash? double backslashes
anything with a backslash is the beggining of an escape sequence
println prints text on different lines
just print will print it on the same line but by using the escape you can print it on seperate lines*/

/*Working with Varibles and Data-Types
As Much the same in mathematics varibles hold values
We have two types of data-Types, Primitive and Refrence;
Primitive: 8 types, boolean, byte, int, char, short, long,float, double
stores data
can only hold 1 value
less memory
faster
Refrence: such as strings, its unlimited (user defined)
stores an address
could hold more than 1 value
more memory
slower

When you want to declare a varible you need to first declare what type of data-type your var is storing, for example int
Then you need to give the varible a name such as X
for example: int x; (interger X)
Then you will give your varible a value or also known as assigning it
x = 123;
but thats too long so lets put it all together also known as initilizing
int x = 123;
 */