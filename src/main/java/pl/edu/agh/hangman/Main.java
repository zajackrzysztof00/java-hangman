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
        Hangman hangman = new Hangman();

       char letter =  inputFrom.wprowadzLitere();

       while (hangman.getAlive()){
           letter = inputFrom.wprowadzLitere();
           boolean result =  word.checkIfLetterInWord(letter);

           if(result){
               word.getOutputWord();
           }
       }

       hangman.moveByOne();



       word.checkIfLetterInWord(letter);
       System.out.println(word.getWord());
       System.out.println(word.getOutputWord());
    }
}

