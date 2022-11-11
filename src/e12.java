
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
EJERCICIO 12
Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, validando
que el primer numero múltiplo del segundo y e imprima si el primer numero es múltiplo del
segundo, sino informe que no lo son.
 */
public class e12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); 
        int numero1 = leer.nextInt();
        int numero2 = leer.nextInt();
       EsMultiplo (numero1, numero2);
    }
    public static void EsMultiplo(int numero1,int numero2){
    
        if (numero1 % numero2 == 0){
            System.out.println("el numero "+numero1+" es multiplo de "+numero2);
        }
        else{
                    System.out.println("el numero "+numero1+" NO2 es multiplo de "+numero2);

        }
    }
 
}
