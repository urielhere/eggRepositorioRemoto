
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
EJERCICIO 10
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número
ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **

 */
public class e10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
    
        int i;
           int j;
      for(i = 0;i<4;i++){
          System.out.println("ingresar numero"+(i+1));
           int num1 = leer.nextInt();
           System.out.print(num1);

         for(j = 0; j < num1;j++){
             System.out.print("*");
        }
            System.out.println(" "); 
      }

    }
    
}
