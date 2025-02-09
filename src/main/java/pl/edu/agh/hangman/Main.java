package pl.edu.agh.hangman;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        GameRun();

    }

    public static void GameRun(){
        Word word = new Word();
        word.pickWord();

        InputFrom inputFrom = new InputFrom();

       char letter =  inputFrom.wprowadzLitere();



       word.checkIfLetterInWord(letter);
       System.out.println(word.getWord());
       System.out.println(word.getOutputWord());
    }
}

