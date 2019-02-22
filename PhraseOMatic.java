/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phraseomatic;

/**
 *
 * @author chris
 */
public class PhraseOMatic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] wordListOne = {"24/7", "Multi-Tier", "30,00 foot",
            "B-to-B", "win-win", "front-end", "web-based", "pervasive",
            "Smart", "Six-Sigma", "Critical-path", "dynamic"};

        String[] wordListTwo = {"Empowered", "sticky", "value-added", "oriented",
            "centric", "distributed", "clustered", "branded", "outside-the-box",
            "positioned", "networked", "focused", "leveraged", "aligned",
            "targeted", "shared", "cooperative", "accelerated"};
        String[] wordListThree = {"process", "tipping-point", "solution",
            "Architecture", "core competency", "strategy", "mindshare",
            "portal", "space", "vision", "paradigm", "mission"};

        // find out how many words in each list
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        // generate 3 random numbers
        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * oneLength);
        int rand3 = (int) (Math.random() * oneLength);

        // build a phrase
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2]
                + " " + wordListThree[rand3];

        // print out the phrase and change values to uppercase letters
        System.out.println("What we need, is a " + phrase.toLowerCase() + "!");
    }
}
