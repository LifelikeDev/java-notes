package com.lifelike.dev;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterClass {

    public static void main(String[] args) throws IOException {

        // FileWriter Class  -  for writing files as well as content in them

        try {
            FileWriter writer = new FileWriter("random.txt");
            writer.write("Something beautiful to behold... \n The skies are wide and bright \n");
            writer.write("Something wonderful to hold... \n The lady stuns in darkness as in light \n");
            writer.append("\n--- Something by LLD ---");
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
