/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contarletras;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author AitorBM
 */
public class ContarLetras {

    public static char[] alfabeto = {
            'a', 'b', 'c', 'd', 'e', 
            'f', 'g', 'h', 'i', 'j', 
            'k', 'l', 'm', 'n', 'ñ', 
            'o', 'p', 'q', 'r', 's', 
            't', 'u', 'v', 'w', 'x', 
            'y', 'z'};
    
    public static void contarLetras(String t) {
        
        int[] contador = new int[27];
        
        for (int i = 0; i < t.length(); i++)
        {
            for (int j = 0; j < alfabeto.length; j++)
            {
                if (t.charAt(i) == alfabeto[j])
                {
                    contador[j]++;
                }
            }
        }
        visualizarRecuento(contador);
    }
    
    public static void visualizarRecuento(int[] c) {
        for (int i = 0; i < c.length; i++) {
            System.out.println(alfabeto[i]+": "+c[i]+" veces.");
        }
    }
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Introduce el texto: ");
        String texto = br.readLine();
        
        contarLetras(texto);
    }
}