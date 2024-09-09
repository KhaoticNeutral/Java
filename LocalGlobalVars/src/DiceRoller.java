import java.util.Random;

public class DiceRoller {

        DiceRoller (){
            Random rand = new Random();
            int number = 0;
            rollDice(rand, number); //to set as global we have passed rand and number as arguments and parameters without doing this we wouldn't be able to acess them
        }

        void rollDice(Random rand, int number){
            number = rand.nextInt(6)+1;
            System.out.println(number);
        }
}

//constructors count as methods
//you could also do this by declaring the number and the instance of the random class outside of the method the code would look something like this
/*
* public class DiceRoller {

*       Random rand;
*       int number; //as you can see it's out of the method but in the class
*
        DiceRoller (){
            rand = new Random();
            rollDice(); //now we dont have to pass the arguments here
        }

        void rollDice(){
            number = rand.nextInt(6)+1;
            System.out.println();
        }
}
*/