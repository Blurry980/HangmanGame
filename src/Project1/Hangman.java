package Project1;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Hangman {
    public static Gameword gameWord = new Gameword(new ArrayList<String>());
    public static String chosenWord = gameWord.getWord();
    public static HangmanArt art = new HangmanArt();

    //public static boolean gameOver = false;
    public static void main(String[] args) {

        //System.out.println("The chosen word is: " + chosenWord);//This is to test the program
        System.out.println(art.titleArt());
        System.out.println();
        ArrayList<Character> letters = new ArrayList<>();
        boolean gameOver = false;
        int lives = 10;
        Scanner scnr = new Scanner(System.in);


        for (int i = 0; i <= chosenWord.length() - 1; i++) {
            letters.add('_');
            //System.out.println(chosenWord[i]);
            // System.out.println(format(letters));
        }
        //display was here
        System.out.println(format(letters));
        while (!gameOver) {
            System.out.println("Guess a letter: ");
            Character guess = scnr.next().charAt(0);
            int change = 0;
            //guess = (char) guess;

            //chosenWord.c
            for (int i = 0; i <= chosenWord.length() - 1; i++) {
                //System.out.println(chosenWord.charAt(i));
                //System.out.println("In for loop");
                //System.out.println(i);
                if (chosenWord.charAt(i) == guess) {
                    letters.remove(i);
                    //System.out.println(letters);
                    letters.add(i, guess);
                    change++;

                    // System.out.println(letters);
                }
            }
            if(change <= 0){
                System.out.println("That letter wasn't in the word.");
                lives--;
                //System.out.println(lives);
                if(lives <= 0){
                    System.out.println("Out of lives. You lose.");
                    gameOver = true;
                }
            }
            if(!letters.contains('_')){
                System.out.println("You win!");
                gameOver = true;
            }

            System.out.println(format(letters));
            System.out.println(art.printStage(lives));


        }
        //System.out.println(format(letters));
    }

    //words.add(words.add( write your code here
    //ArrayList<String> cars = new ArrayList<>();
    //cars.add("Toyota");

    public static String format(ArrayList<Character> letters) {
        String display = "";
        for (Character letter : letters) {
            display += letter + " ";
        }
        return (display);
    }
}
