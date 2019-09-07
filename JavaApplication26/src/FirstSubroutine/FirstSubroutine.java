/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FirstSubroutine;

import java.util.Scanner;

/**
 *
 * @author chris
 */
public class FirstSubroutine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Enter a word, words or a list of words and/or numbers to check if they are a palindrome: ");// tell user to enter a word

        Scanner sc = new Scanner(System.in); // read in a string from user

        String s = sc.nextLine(); // read the users input and save it as a variable

        firstSubroutines rev = new firstSubroutines();
        sc.close(); // close the scanner

        // initialize the objects in the firstSubroutines class and call the methods
        String lower = rev.getLower(s); // convert input to lowercase
        String pal = rev.getReverse(lower); // reverse the input
        String newVal = lower; //save the input from lower into a new String object named newVal

        pal = pal.replaceAll("[^a-zA-Z0-9]", ""); // replace all characters that arent lowercase a-z uppercase A-Z or integers 0-9 
        newVal = newVal.replaceAll("[^a-zA-Z0-9]", "");// replace all characters that arent lowercase a-z uppercase A-Z or integers 0-9

        System.out.println("Stripped: " + newVal); // display the Stripped version in Standard Output
        System.out.println("Reversed: " + pal); // display the reversed version in standard output

        if (pal.equals(newVal)) { // call for loop and check if the value of object palue is the same as the value of object newVal

            System.out.println(pal.replaceAll("[^a-zA-Z0-9]", "") + ": is a palindrome\n"); // ensure that all characters that are non-alphanumeric are removed
                                                                                            // and print the user input reversed and lowercase telling the user if it is a palindrome
        } else {
            System.out.println(pal.replaceAll("[^a-zA-Z0-9]", "") + ": is not a palindrome\n"); // ensure that all characters that are non-alphanumeric are removed
                                                                                                // and print the user input reversed and lowercase telling the user if it is not a palindrome

        }// end if....else

    }//end main
}//end class
