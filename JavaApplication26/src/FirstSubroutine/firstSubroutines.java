/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FirstSubroutine;

/**
 *
 * @author chris
 */
public class firstSubroutines {

    public static String reverse = ""; // create two static String variables that have an empty string as there value
    public static String Strip = "";
    public static String i = "";

    public static String firstSubroutines(String pal) {// create a static subroutine named firstSubroutines that returns a empty string as its value
        return i;
    }

    public String getLower(String lower) { // create a public method of type String to convert string input to lowercase

        return lower = lower.toLowerCase();
    }

    public static String getReverse(String str) { // create a public static string that returns the reverse of the string input

        for (int i = str.length() - 1; i >= 0; i--) { // create a for loop to reverse the string
            reverse = reverse + str.charAt(i);
        }
        return reverse; // return the for loop 
    }
}
