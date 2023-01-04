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
        ArrayList<String> letters = new ArrayList<>();
        boolean gameOver = false;
        int lives = 10;

        for(int i = 0; i <= chosenWord.length() - 1; i++){
            letters.add("_ ");
            //System.out.println(chosenWord[i]);
           // System.out.println(format(letters));
        }
  //display was here
        System.out.println(format(letters));
        while(!gameOver){
            Scanner scnr = new Scanner(System.in);
            System.out.println("Guess a letter: ");
            String guess = scnr.nextLine();
            //guess = (char) guess;

            //chosenWord.c
            for(int i = 0; i <= chosenWord.length() - 1; i++) {
                    //System.out.println(chosenWord.charAt(i));
                if(chosenWord.charAt(i)==guess.charAt(0)){
                    letters.remove(i);
                    //System.out.println(letters);
                    letters.add(i ,guess);
                    //System.out.println(letters);
                }
               // System.out.println(display);

            }
            System.out.println(format(letters));
        }

	//words.add(words.add( write your code here
        //ArrayList<String> cars = new ArrayList<>();
        //cars.add("Toyota");
    }
    public static String format(ArrayList<String> letters){
        String display = String.join(" ", letters);
        return(display);
    }
}
