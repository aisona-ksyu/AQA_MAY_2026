package org.prog.session8.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainHome {

    public static void main(String[] args) {
        MainHome.copyFile("file.txt");
    }
        public static void copyFile(String fileName){

        FileReader reader = null;

        try {
             reader = new FileReader(fileName);
            if (reader.ready()){
                System.out.println("file ready for reading");}
            else{
                System.out.println("file not ready for reading");}
        } catch (FileNotFoundException e) {
            System.out.println("file NOT found");
        } catch (Exception e) {
           System.out.println("something else went wrong");
        } finally {
            if (reader != null) {
                try {
                        reader.close();
                        } catch (IOException e) {
                    System.out.println("Error while closing file");
                }
            }
        }


    }

}
