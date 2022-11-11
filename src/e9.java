
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
EJERCICIO 9
Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del
bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar el
resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse.
Nota: recordar el uso de la sentencia break.
 */
public class e9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int contador = 0;
        int contV = 0;
        int numero;
        do{
            numero = leer.nextInt();
            if(numero != 0){
            contador += numero;
            }
            else{
                 System.out.println("se capturo el numero 0 ");
             break;   
            }
            
            contV = contV + 1;
        }while(contV < 20 );
        
       
        System.out.println("la suma de los numeros ingresados es de "+contador);
    }
    
}
