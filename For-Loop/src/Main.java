public class Main {
    public static void main(String[] args) {

       for(int index = 10; index >= 0; index--) {
            System.out.println(index);
            index-=2;
       }
        System.out.println("Happy New year!");
    }
}

//for loops execute a block of code a limited amount of times
//people often shorten index to i but I wont for the sake of clarity
//the for loops has to have a declared index, a condition, then you can increment or decrement 