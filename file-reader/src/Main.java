import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {


        try {
            FileReader reader = new FileReader("art.txt");
            int data = reader.read();
            while (data != -1) {
                System.out.print((char) data);
                data = reader.read();
            }
            reader.close();


        }catch(FileNotFoundException e) {
            e.printStackTrace();
        }catch(IOException e) {
            e.printStackTrace();
        }

    }
}
// the file reader class allows you to read the contents of a file as a stream of characters, one by one
// read() returns an int value which contains the byte value
//when read() returns a -1, there is no more data to be read
//create your own txt file called art and attach some ASCII art super fun