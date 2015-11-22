/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz3x3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author AitorBM
 */
public class Matriz3x3 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[][] matriz = new int[3][3];
        
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                System.out.print("Introduce el valor "+i+","+j+": ");
                matriz[i][j] = Integer.parseInt(br.readLine());
            }
        }
        
        for (int i = 0; i < 3; i++)
        {
            System.out.format("%d %d %d %n", matriz[i][0],matriz[i][1],matriz[i][2]);
        }
        
        
    }
}
