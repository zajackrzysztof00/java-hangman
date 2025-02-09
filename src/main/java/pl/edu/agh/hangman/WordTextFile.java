package pl.edu.agh.hangman;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordTextFile extends Word{

    private String filePath;

    public WordTextFile(String filePath) {
        load();
    }
    @Override
    public void load(){
        try {
            File myObj = new File(this.filePath);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                data = data.toLowerCase();
                getWords().add(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
