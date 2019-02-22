/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

import com.sun.prism.Graphics;
import java.awt.Color;

/**
 *
 * @author chris
 */
public class Shapes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            Graphics g = null;
        
        int y; // y-coordinate for the line
        int i; // loop control variable
        y = 50; // y starts at 50 for the first line
        for (i = 1; i <= 10; i++) {
            g.drawLine(100, y, 300, y);
            y = y + 10; // increase y by 10 before drawing the next line.
        }
        }catch(Exception e){
                System.out.println("There is an error in the code, fix the shit!");
                }}
        }
    


