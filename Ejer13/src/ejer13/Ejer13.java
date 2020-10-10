/*
 13.- Dado un año, se comprobará que es positivo y menor que 2100, 
si no cumple estas condiciones, se mostrará un mensaje de error.  Si el año es correcto se dirá si es bisiesto o no.

Un año es bisiesto si es múltiplo de 4 pero no de 100 aunque sí de 400.
 */
package ejer13;


public class Ejer13 {

 
    public static void main(String[] args) {
        int ano = 2102;
        
        if ( ano > 0 && ano < 2100){     // Comprobamos que cumpla las dos condiciones
            System.out.println( " El año es positivo y menor que 2100 ");
            if ( (ano % 4 == 0) && (ano % 100 != 100) || (ano % 400 == 0 )){ // metemos otro if para saber si es bisiesto o no 
               System.out.println(" Ademas el año" + ano + "es bisiesto");  
           }
        }else {
            System.out.println(" ERROR 404 ");  // si no es bisiseto error
        }
    }
    
}
