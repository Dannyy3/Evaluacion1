/*
Ejer3.-Crea un programa con el tipo de datos correcto para guardar los siguientes datos:
a)Si un empleado está casado o no.
b)Valor no modificable: 999999
c)El día de la semana (del 1 a 7).
d)El día del año (del 1 al 365).
e)Sexo: sólo guardará una letra para indicar el sexo, 'V' o 'M'.
f)Milisegundos :1298332800000
g)Almacenar el total de una factura. (10350.678)
h)Población mundial del planeta tierra.
 */
package ejer3;

/**
 *
 * @author danie
 */
public class Ejer3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean casado = true; //Creo el boolean y le digo que es true 
        System.out.println("El valor de la variable casado es " + casado);
            
        final int MAXIMO = 999999; //FINAL porque no se va a modificar al ser un maximo y int porque es un entero//
        System.out.println("El valor de la variable MAXIMO es " +MAXIMO);
        
        byte diaSem = 1; // Utilizo un byte ya que los dias de la semana son dias enteros del 1 al 7
        System.out.println("El valor de la variable diasem es " + diaSem);
        
        short diaAnual = 300; // Utilizo un short ya que los dias del año  son dias enteros hasta el 365
        System.out.println("El valor de la variable diasem es " + diaAnual);
        
        long miliseg; //Pongo long ya que se trata de un numero muy grande
        miliseg = 1298332800000l; //Añado una l al final ya que si no no me deja
        System.out.println("El valor de la variable miliseg es " +miliseg);
        
        float totalFactura = 10350.678f; //Pongo un float ya que se trata de un numero largo con decimal
        System.out.println("El valor de la variable totalfactura es " +totalFactura);
        
        long poblacion; //Pongo un long ya que es un numero grande y entero 
        poblacion = 6775235741l;
        System.out.println("El valor de la variable población es " +poblacion );
        
        char sexo = 'M'; // Pongo un char ya que es un caracter.
        System.out.println("El valor de la variable sexo es " +sexo);
    }
    
}
