
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC01
 */
/*
EJERCICIO 6
Implementar un programa que le pida dos números enteros a usuario y determine si ambos o
alguno de ellos es mayor a 25.
*/
public class e6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     Scanner leer = new Scanner(System.in);
        System.out.println("ingresar el numero 1");
        int numero1 = leer.nextInt();
        System.out.println("ingresar numero 2");
        int numero2 = leer.nextInt();
        if (numero1 > 25){
            System.out.println("el numero "+numero1+" es mayor a 25");
        }
       
        else{
            System.out.println("el numero"+numero1+" es menor a 25");
        }
         if(numero2 > 25){
               System.out.println("el numero "+numero2+" es mayor a 25");
        } 
           else{
            System.out.println("el numero"+numero2+" es menor a 25");
        }
    }
}
