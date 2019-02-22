/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllstatements;

import java.util.*;

/**
 *
 * @author chris
 */
public class ControllStatements {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // for loop
        /* takes three variables 
        where you want the loop to start(initializer); where you want the loop to end(conditional); 
       and how much you want to increment it by (increment) its common to use a unary operator for this */

        //for(int counter = 0; counter < 20; counter++){
        //System.out.println(counter);
        int c137 = 6;
        int counter2 = 65;
        for (int c138 = 0; c138 < counter2; c138++) {

            while (c137 < counter2) {
                c137 += 1;
            }
            System.out.println(c137);
        }
        int age = 77;
        // if else statement
        //if (age < 50) {
        // System.out.println("You are young");
        //} else {
        // System.out.println("You are old");
        //}
        // nested if else statement
        if (age < 50) {
            System.out.println("You are young");
        } else {
            System.out.println("You are getting old");
            if (age > 75) {
                System.out.println("You are really old");
            } else {
                System.out.println("dont worry, you aren't really that old");
            }
        }
        int kAge;
        kAge = 18;

        switch (kAge) {
            case 1:
                System.out.println("You can crawl");
                break;
            case 2:
                System.out.println("You can talk");
                break;
            case 3:
                System.out.println("You can get in trouble");
                break;
            default:
                System.out.println("i dont know how old you are");
                break;
        }
        int m = 0;
        for (int l; m < 1000; m++) {
            if (m % 2 == 0) {
                continue;
            } else {
                System.out.println(m);
            }
        }

        Scanner input = new Scanner(System.in);
        int i = 0;
        do {
            try {
                System.out.println("Enter a number to get the mod: ");
                float n1f = input.nextInt();

                System.out.println("Enter a number to get the mod: ");
                float n2f = input.nextInt();
                float sum = n1f % n2f;

                System.out.println("the the mod of the two nums is: " + sum);

                i = 2;

            } catch (Exception e1) {
                System.out.println("You can't do that!!!!");
            }
        } while (i == 0);
        //-------------------------------------------------------------//
        int i2 = 0;
        do {
            try {
                System.out.println("Enter a number to divide: ");
                float n3f = input.nextInt();

                System.out.println("Enter a number to divide: ");
                float n4f = input.nextInt();
                float sum2 = n3f / n4f;
                System.out.println("the the mod of the two nums is: " + sum2);
                i2 = 2;

            } catch (Exception e1) {
                System.out.println("You can't do that!!!!");
            }
        } while (i2 == 0);

        for (int hello1 = 5; hello1 > 0; hello1--) {
            System.out.println("Blast off in " + hello1);
        }
        System.out.println("Blast OFF!!!!");

        int i3 = 1;
        while (i3 <= 5) {

            i3++;
            System.out.println(i3 + " ");
        }

        System.out.println("\n");
        int i4 = 1;
        while (i4 <= 5) {

            System.out.println(i4 + " ");
            i4++;
        }
        System.out.println("\n");
        int number = 0;
        while (number < 6) {
            int nums = number++;
            System.out.println(nums);

        }
        System.out.println("\n");
        int counter3 = 1;
        do {
            System.out.println("The current loop variable is " + "\t" + counter3);
            counter3++;
        } while (counter3 <= 10);

        int age3;
        age3 = 1;
        try {
            switch (age3) {
                case 1:
                    do {
                        System.out.println("you are " + age3 + " and you are youung");
                    } while (age <= 1);
                    break;
                case 2:
                    do {
                        System.out.println("You are " + age3 + " and you are young");
                    } while (age >= 2);
                    break;
            }
            }
            catch(Exception e){
                System.out.println("Error: there's a bug");
                }
        
    }
}
