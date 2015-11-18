/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperaturasdia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author AitorBM
 */
public class TemperaturasDia {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        Double[] temperaturas = new Double[24];
        
        for (int i = 0; i < 24; i++)
        {
            System.out.print("Introduce la temperatura: ");
            temperaturas[i] = Double.parseDouble(br.readLine());
        }
        
        double max = temperaturas[0];
        double min = temperaturas[0];
        double media = 0;
        
        for (int i = 0; i < 24; i++)
        {
            if (max < temperaturas[i])
            {
                max = temperaturas[i];
            }
            
            if (min > temperaturas[i])
            {
                min = temperaturas[i];
            }
            
            media = media + temperaturas[i];
        }
        
        media /= 24;
        
        System.out.println("max: "+max+" min: "+min+" media: "+media);
    }
}