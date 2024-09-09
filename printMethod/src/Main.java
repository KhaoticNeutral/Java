public class Main {
    public static void main(String[] args) {

        boolean myBoo = true;
        char myChar = '$';
        String myString = "Victor";
        int myInt = 20;
        double myDouble = 3.146598432795;

        System.out.printf("This is a format string %d", 123); //the format specifyer can be put anywhere
        System.out.printf("%b", myBoo); //boolean
        System.out.printf("%c", myChar); //character
        System.out.printf("%s", myString); //string
        System.out.printf("%d", myInt); //intergers
        System.out.printf("%f", myDouble); //for floating and double

        System.out.printf("Hello %10s", myString); //width example, it'll reach the width setting by adding spaces or remove

        System.out.printf("You have this much money %.2f", myDouble); //precision field example

    }
}

//printf() method is used to control, format and display text to the console
//it has two arguments format string + object/varible/value
//% [flags] [precision] [width] [conversion-character] the percent sign is the format specifyer
//d is for decimal numbers

//the width field shows the minimum number of characters to be written in the output
//the precisioin field will round floating and double types so instead of having the whole decimal you'll limit to like 4

//Flags add an effect to the output based on the flag added to the specifier
//- is left justify, it is automatically right justfied. 
//+ output a plus or minus sign for a numeric value
// 0 numeric values are 0 padded
//, grouping seperators if numbers are more than 1000

