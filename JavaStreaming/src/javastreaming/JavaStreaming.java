/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javastreaming;

import java.util.stream.Stream;

/**
 *
 * @author EddyJ
 */
public class JavaStreaming {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double[][] x = {{3, 1}, {2, -1}, {2, 0}};
        
        java.util.Arrays.sort(x, (s1, s2) -> (int)(s1[1] - s2[1]));
        
        for(int i = 0; i < x.length; i++){
            for(int j=0; j < 2; j++){
                if (j == 0){
                    System.out.print("(");
                }
                System.out.print(x[i][j]+", ");
                if (j == 1) {
                    System.out.print("), ");
                }
            }
        }
    }
    
}
