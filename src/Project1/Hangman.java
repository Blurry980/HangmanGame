package Project1;

import java.util.ArrayList;
import java.util.Scanner;

public class Hangman {
    public static Gameword gameWord = new Gameword(new ArrayList<String>());
    public static String chosenWord = gameWord.getWord();
    //public static boolean gameOver = false;
    public static void main(String[] args) {

        System.out.println("The chosen word is: " + chosenWord);//This is to test the program
        System.out.println();
        ArrayList<String> letters = new ArrayList<String>();
        boolean gameOver = false;

        for(int i = 0; i <= chosenWord.length() - 1; i++){
            letters.add("_ ");
            //System.out.println(chosenWord[i]);
        }
        String display = String.join(" ", letters);
        System.out.println(display);
        while(!gameOver){
            Scanner scnr = new Scanner(System.in);
            System.out.println("Guess a letter: ");
            String guess = scnr.nextLine();

            //chosenWord.c
        }

	//words.add(words.add( write your code here
        //ArrayList<String> cars = new ArrayList<>();
        //cars.add("Toyota");
    }
}
