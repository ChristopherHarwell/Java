/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwithstrings;

/**
 *
 * @author chris
 */
public class FunWithStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int beerNum = 99;
        String word = "bottles";

        if (beerNum == 1) {
            word = "bottle";
        }
        if (beerNum == 0) {
            System.out.println("No more " + word + " beer on the wall!");
        }
        while (beerNum > 0) {
            System.out.println(beerNum + " " + word + " beer on the wall!\n" + beerNum + " " + word + " of beer\n");
            System.out.println("Take one down." + "\nPass it around.");
            beerNum = beerNum - 1;
        }
    
    }
    }

