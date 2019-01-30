/*
Seamus de Cleir
Pangram Checker program
*/

import java.util.ArrayList;

public class PangramChecker {

    public boolean isPangram(String input) {
        
        // Removes whitespace and
        // Turns the string into an array of lowercase letters
        char[] letters = input.toLowerCase().replaceAll("\\s+","").toCharArray();
        
        // int to count number of letters present
        int x = 0;

        // Array of every letter 
        char[] all = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        // Creates an ArrayList and adds every letter as an object
        ArrayList<Character> allLetters = new ArrayList<>();
        for(char i: all){
            allLetters.add(i);
        }

        // Compares letters to allLetters. If there is a match the object is removed
        for(char y: letters){
            if(allLetters.contains(y)){
                allLetters.remove(allLetters.indexOf(y));
                x++;
            }
        }

        // If there are 26 unique matches then it's a a pangram
        return(x==26?true:false);

        }

    

}
