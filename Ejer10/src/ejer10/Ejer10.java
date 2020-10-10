/*
 Ejer10.-Dados  3 números y 
decir cuál de ellos es el mayor.
 */
package ejer10;


public class Ejer10 {

   
    public static void main(String[] args) {
        int n1 = 1;   // Declaro las variables
        int n2 = 6;
        int n3 = 9;
        
        // Creo una condicional que cumpla dos condiciones
        
        if ( n1 > n2 && n1 > n3){  // Si cumple las dos N1 es el mayor
            System.out.println( n1 + " Es el mayor");
        }else if ( n2 > n3 ){    
            System.out.println( n2 + " Es el mayor ");
        }else {                                 // Si no se cumple nada de lo anterio n3 es el mayor
            System.out.println( n3 + " Es el mayor "); 
        }
        
    }
    
}
