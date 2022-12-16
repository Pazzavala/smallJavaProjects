package Basic;
import jdk.jshell.spi.ExecutionControl;

import java.io.IOException;
import java.io.File;
import java.util.Scanner;
import javax.sound.sampled.*;

public class Audio {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        Scanner in = new Scanner(System.in);

        File musicFile = new File("Rihanna - Lift Me Up (From Black Panther： Wakanda Forever).wav");

        AudioInputStream audioStream = AudioSystem.getAudioInputStream(musicFile.getAbsoluteFile());
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);

        String response;

        do {
            System.out.println("P - Play\nS - Stop\nR - Reset\nQ - Quit");
            System.out.print("Enter your choice: ");
            response = in.next().toUpperCase();

            switch (response) {
                case ("P") -> clip.start();
                case ("S") -> clip.stop();
                case ("R") -> clip.setMicrosecondPosition(0);
                case ("Q") -> clip.close();
                default -> System.out.println("Not valid response");
            }
        }
        while (!response.equals("Q"));

        System.out.println("GoodBye!");
    }
}
