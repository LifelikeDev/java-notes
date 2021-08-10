package com.lifelike.dev;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderClass {

    public static void main(String[] args) {

        /* File Reader  -  reads the content of a file as a stream of characters.
                           one by one read() returns an int value which contains the byte value
                             of the first character of the content
                           when read() returns -1, there's no more data to be read
                           # notes above copied from Bro
        */

        try {
            FileReader reader = new FileReader("random.txt");
            // returns the integer value of the byte of the first character
            int data = reader.read();

            while (data != -1) {
                // casting the integer type to char in order to see the actual characters
                System.out.print((char) data);
                data = reader.read();
            }

            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
