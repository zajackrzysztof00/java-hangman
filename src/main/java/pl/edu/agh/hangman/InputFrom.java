package pl.edu.agh.hangman;

import java.util.Scanner;

public class InputFrom {

 // - ponizej sprawdzenie dzialania metody
//    public static  void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        char letter = wprowadzLitere(scanner);
//        System.out.println(letter);
//    }

    Scanner scanner = new Scanner(System.in);

    //funkcja zwracajaca wpisana litere przez uzytkownika
    public  char wprowadzLitere() {
        char letter = ' ';
        while (true) {
            System.out.print("Guess a letter: ");
            String input = this.scanner.nextLine();
            if (input.length() == 1 && Character.isLetter(input.charAt(0))) {
                letter = input.charAt(0);
                break;
            } else {
                System.out.println("niepoprawny znak");
            }
        }
        return letter;
    }




}
