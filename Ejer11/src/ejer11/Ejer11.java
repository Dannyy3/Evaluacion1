/*
Ejer11.- Un comercio en el mes de enero hace un 10% de descuento.  
Dado un importe y un mes, mostrar el total a pagar.
 */
package ejer11;


public class Ejer11 {

    
    public static void main(String[] args) {
        int mes = 5;  // Declaro las variables 
        float imp = 99.99f;  
        float descuento;
        float total;
        
        if (mes == 1){ // Añado una condicion 
            descuento = imp * 0.1f;     // realizo la operacion para calcular el descuento 
            total = imp - descuento;    // le resto el descuento al total 
            System.out.println("Tiene que pagar " + total); 
        }else{
            System.out.println("Tiene que pagar " + imp);
        }
        
        
        
    }
    
}
