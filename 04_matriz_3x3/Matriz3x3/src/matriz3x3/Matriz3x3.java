/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz3x3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author AitorBM
 */
public class Matriz3x3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[][] matriz = new int[3][3];
        
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                System.out.println("Introduce el valor "+i+","+j+": ");
            }
        }
    }
}