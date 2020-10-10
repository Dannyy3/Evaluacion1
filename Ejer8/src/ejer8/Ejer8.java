/*
 Ejer8.- Dados dos números decir 
cuál es el mayor.
 */
package ejer8;


public class Ejer8 {

    public static void main(String[] args) {
       int n1 = 67; // Declaro dos variables
       int n2 = 125;
       
       if (n1 > n2){  // Les asigno la condicional
           System.out.println(n1+ " Es el mayor");
       }else if (n1 == n2 ){
           System.out.println(" Son iguales " +n1+ " y " +n2 );
       }else {
           System.out.println(n2 +  " Es el mayor");
       }
    }
    
}
