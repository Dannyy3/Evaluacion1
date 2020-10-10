/*
Ejer12.- Realizar un programa en Java
que dado un número entero, 
visualice en pantalla si es par o impar. 
 */
package ejer12;


public class Ejer12 {

   
    public static void main(String[] args) {
        int nEntero = 25;  // declaro una variable en este caso imapr
        
        if ( (nEntero % 2) == 0 ){ // Utilizo el % para saber si el resto es 0
            System.out.println("El numero es par ");
        }else {
            System.out.println("El numero es impar");  // al no ser 0 es impar
        }
    }
    
}
