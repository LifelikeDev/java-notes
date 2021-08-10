package com.lifelike.dev;
import java.io.File;
import java.io.IOException;

public class FileClass {

    public static void main(String[] args) throws IOException {

        /* File  -  An abstract representation of file and directory pathnames
           some useful methods include
                file.exist() - checks for the existence of a file or directory
                file.getPath() -  gets the path of an existing file or directory
                file.getParent() - gets the parent path of the file / directory
                etc.

         */

        // looking in current project directory
        File file = new File("palin-visual.txt");
        // looking elsewhere in the computer
//        File file = new File("C:\\Uss\Figa.lnk");

        if (file.exists()) {
            System.out.println(file + " exists");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.getCanonicalPath());
            System.out.println(file.lastModified());
            System.out.println(file.getParent());
            file.delete();
        }
        else {
            System.out.println(file + " does not exist");
        }

    }
}
