/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fechatexto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author AitorBM
 */
public class FechaTexto {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] dias = { 
            "uno", "dos", "tres", 
            "cuatro", "cinco", "seis", 
            "siete", "ocho", "nueve", 
            "diez", "once", "doce", 
            "trece", "catorce", 
            "quince", "dieciséis", 
            "diecisiete", "dieciocho", 
            "diecinueve", "veinte", 
            "veintiuno", "veintidós", 
            "veintitrés", "veinticuatro", 
            "veinticinco", "veintiseis", 
            "veintisiete", "veintiocho", 
            "veintinueve", "treinta"};
        
        String[] meses = {
            "enero", "febrero", "marzo", 
            "abril", "mayo", "junio", 
            "julio", "agosto", "septiembre",
            "octubre", "noviembre", "diciembre"};
        
        System.out.print("Introduce la fecha en formato DD/MM/2015: ");
        String fechaN = br.readLine();
        
        String[] fechasN = fechaN.split("/");
        
        int diaN = Integer.parseInt(fechasN[0]);
        int mesN = Integer.parseInt(fechasN[1]);
        int anoN = Integer.parseInt(fechasN[2]);
        
        System.out.print(dias[diaN-1]+" de "+meses[mesN-1]+" de dos mil quince.");
    }
}