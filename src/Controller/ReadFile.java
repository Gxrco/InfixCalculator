package Controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * The type Read file.
 */
public class ReadFile {

    /**
     * Lee la ruta del archivo donde se encuentra el Postfix
     *
     * @param fpath ruta del archivo
     * @return data string
     */
    public String text(String fpath){
        String data = "-";
        try {
            File myObj = new File(fpath);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                data = myReader.nextLine();
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return data;
    }
}