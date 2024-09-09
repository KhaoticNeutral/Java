public class Main {
    public static void main(String[] args) {

        Boolean a = true;
        Character b = '@';
        Integer c = 123;
        Double d = 3.14;
        String e = "Victor"; //autoboxing

        if(a == true) {
            System.out.println("true");
        }
        if(b == '@'){
            System.out.println("true");
        } //unboxing

    }
}

//Wrapper classes allow you to use primitive data types as refrence data types
//refrence data types contain useful methods
//can be used with collections for example an ArrayList
//Strings do not have to be used in a wrapper class because it is already a refrence data type
//When using wrapper classes and refering to the primitive data-type the name is capatalized and spelt out so instead of int it would be Interger
//autoboxing the Java Complier is able to directly assign the primitive data type and it's corresponding object wrapper class
//unboxing the oppisite of auto boxing, converts wrapper classes back to their primitive dataset