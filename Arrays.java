/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author chris
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Index\tValue");
        int ArrayList[] = {1,2,3,4,5,6,7,8,9,14,123,12453,1245};
        
        for(int counts = 0; counts < ArrayList.length; counts++) {
            System.out.println(counts + "\t" + ArrayList[counts]);
        }
    }
    
}
