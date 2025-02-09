package pl.edu.agh.hangman;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Hangman {

    public static final String[] HANGMANPICS = new String[]{
            "  +---+\n" +
                    "  |   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    "  |   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|\\  |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|\\  |\n" +
                    " /    |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|\\  |\n" +
                    " / \\  |\n" +
                    "      |\n" +
                    "========"
    };

    Boolean alive = true;

    public void setAlive(Boolean alive) {
        this.alive = alive;
    }

    public Boolean getAlive() {
        return alive;
    }

    public void moveByOne(){

    }
    public static void drawHangman(){
        // pamietac na jakim jest znaku
        // zwracac albo krok animacji -
        // jezeli true to zwraca ostani
        // jezeli false kolejny krok
        // jezeli false i wyjatek to exeption

        Word someword = new Word();
        someword.pickWord();
//       Boolean targetChar = someword.checkIfLetterInWord();


//        String word = "JAVA";
//        char targetChar = 'A';
        int count = 0;

        // Iteracja przez znaki w słowie
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == targetChar) {
                List<String> words = Collections.singletonList(HANGMANPICS[0]);

                System.out.println(words.toString());
            }else {
                List<String> words = Collections.singletonList(HANGMANPICS[i]);
                System.out.println(words.toString());
                count++;
            }
        }
    }

    public static void main(String[] args) {




        }








}
