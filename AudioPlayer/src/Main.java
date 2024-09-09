import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {

        Scanner scanner = new Scanner(System.in);
        File file = new File("What I Want.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip  = AudioSystem.getClip();
        clip.open(audioStream);

        String response = "";

        while(!response.equals("stop")) {
            System.out.println("Type \"stop\" to stop the audio, Type \"start\" to start the audio, Type \"restart\" to restart the audio, Type \"quit\" to quit.");
            System.out.print("Enter your choice: ");

            response = scanner.next();
            response = response.toLowerCase();

            switch(response) {
                case ("start"): clip.start();
                break;
                case ("stop"): clip.stop();
                break;
                case ("restart"): clip.setMicrosecondPosition(0);
                break;
                case ("quit"): clip.close();
                break;
                default: System.out.println("Invalid choice");
                break;
            }
        }
        System.out.println("Goodbye!");
    }
}