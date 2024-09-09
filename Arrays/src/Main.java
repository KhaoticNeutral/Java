public class Main {
    public static void main(String[] args) {

        String[] cars = {"honda","hyundai","ford","BMW"};

        cars[0] = "samsung";

        System.out.println(cars[0]);

        String[] flowers = new String[3];
        flowers[0] = "rose";
        flowers[1] = "melon";
        flowers[2] =  "lilly";

        System.out.println(flowers[0]);

        for(int i=0; i<flowers.length; i++){
            System.out.println(flowers[i]);
        }

    }
}

//arrays store multiple values
//computers start counting from 0 so if you want to call the first held data set you're actually calling 0
//if you try to call an array that does not exsist you will get an array out of bounds
//when you make arrays the data all has to be the same data type else you'll get a data type that does not match
//you can also use a for loop to itterate through all the values