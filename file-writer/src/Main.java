import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("Poem.txt");
            writer.write("Roses are red \n violets are blue \n coding can be hard \n but I believe in you!");
            writer.append("\n a poem by me");
            writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
//you of course create a file writer
//make sure that this file writer is in a try catch
//write will write to the text file
//append will add text at the end
//always to make sure to close your writer 