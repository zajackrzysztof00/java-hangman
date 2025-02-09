package pl.edu.agh.hangman;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Word {

    private ArrayList<String> words = new ArrayList<>();
    private String word;
    private String outputWord;

    public Word() {
        loadTxtFile();
    }

    public void loadTxtFile(){
        try {
            File myObj = new File("src/main/resources/slowa.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                words.add(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void pickWord(){
        Random rand = new Random();
        int rand_int1 = rand.nextInt(words.size());
        word = words.get(rand_int1);
        outputWord = "";
        for (int i = 0; i < word.length(); i++) {
            outputWord += "_";
        }
    }

    public void actualizeWord(char letter){
        String newOutputWord = "";
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                newOutputWord += word.charAt(i);
            } else {
                newOutputWord += outputWord.charAt(i);
            }
        }
        this.outputWord =  newOutputWord;

    }

    public boolean checkIfLetterInWord(char letter){
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                actualizeWord(letter);
                return true;
            }
        }
        return false;
    }

    public ArrayList<String> getWords() {
        return words;
    }

    public void setWords(ArrayList<String> words) {
        this.words = words;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getOutputWord() {
        return outputWord;
    }

    public void setOutputWord(String outputWord) {
        this.outputWord = outputWord;
    }
}
