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

        String w = word.getWord();
        System.out.println(word.getWord());
        while (hangman.getAlive()){
            char letter = inputFrom.wprowadzLitere();
            boolean result = word.checkIfLetterInWord(letter);
            if(result){
                System.out.println(word.getOutputWord());
                hangman.drawHangman();
                if (w.equals(word.getOutputWord())){
                    break;
                }
            } else {
                System.out.println(word.getOutputWord());
                hangman.moveByOne();
                hangman.drawHangman();
            }
        }
        Result gameResult = new Result();
        gameResult.wyswietlWynik(hangman.getAlive());
    }
}

