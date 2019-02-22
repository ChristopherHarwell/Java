/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpsls;
import java.util.*;
/**
 *
 * @author chris
 */
public class RPSLS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String computerMove;
        try {  
        switch ((int) (5 * Math.random())) {
            case 0:
                computerMove = "Rock";
                break;
            case 1:
                computerMove = "Paper";
                break;
            case 2:
                computerMove = "Scissors";
                break;
            case 3:
                computerMove = "Lizard";
                break;
            default:
                computerMove = "Spock";
        
                        
        }
        
        System.out.println("The computer’s move is " + computerMove);
        String yourMove;
        switch ((int) (5* Math.random())){
            case 0:
                yourMove = "Rock";
                break;
            case 1:
                yourMove = "Paper";
            case 2:
                yourMove = "Scissors";
            case 3:
                yourMove = "Lizard";
            default:
                yourMove = "Spock";
        }
        
        System.out.println("Your move is " + yourMove);
        }catch(Exception e) {
        System.out.println("There is an error");
        }
        
        }
        }
    


