package com.lifelike.dev;
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class AudioPlayer {

    public static void main(String[] args) throws IOException, UnsupportedAudioFileException, LineUnavailableException {

        // To be able to play the sound, you need to keep the program running
        // To achieve this, either add a Scanner or add some GUI system
        Scanner scanner = new Scanner(System.in);

        File audioFile = new File("C:\\Users\\Navian\\Desktop\\Momma Akra.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);

        String userResponse = "";

        while (!userResponse.equals("Q")) {
            System.out.println("P = Play, S = Stop, R = Reset, Q = Quit");
            System.out.println("Enter a choice");

            userResponse = scanner.next();
            userResponse = userResponse.toUpperCase();

            if ("P".equals(userResponse)) {
                clip.start();
            } else if ("S".equals(userResponse)) {
                clip.stop();
            } else if ("R".equals(userResponse)) {
                clip.setMicrosecondPosition(0);
            } else if ("Q".equals(userResponse)) {
                clip.close();
            } else {
                System.out.println("Invalid input");
            }
        }

        System.out.println("Exiting program...");

    }
}
