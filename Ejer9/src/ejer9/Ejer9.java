/*
Ejer9.- Dados dos números, si el primero es mayor que el segundo
se intercambiarán los valores, es decir, 
se cambiarán los valores de ambas variables.  
Al final, mostrar los números ordenados.

Resultado:
 */
package ejer9;


public class Ejer9 {

   
    public static void main(String[] args) {
        int n1 = 32; // Declaro dos variables 
        int n2 = 10;
        
        if ( n1 > n2 ){ //creo una condicional 
            int aux;       // Intruduzco un auxiliar para poder cambiar el valor      
            aux = n1;
            n1 = n2;
            n2 = aux;      
      
            System.out.println("Los numeros son " + n1 + " " + n2); // Lo saco a pantalla
        }else { // Si no se cumple que n1 > n2 estaria bien
            System.out.println("Los numeros son " + n1 + "" + n2 );
        }
    }
    
}
