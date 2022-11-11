/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
EJERCICIO 13
Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y
define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.
 */
public class e13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String [] vector;
        vector = new String[4];
        int i;
        for (i = 0; i<4;i++){
         vector[i] = leer.nextLine();
        }
                
        for (i = 0; i<4;i++){
            System.out.println(vector[i]);
        }
        
    }
    
}
