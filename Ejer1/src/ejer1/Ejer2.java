/*
 Ejer2.- Tipos de variables
 */
package ejer1;

/**
 *
 * @author Alumno
 */
public class Ejer2 {
    public static void main(String [] args){
        //Declaracion de constantes 
        final float PI = 3.14f;
        final double OTRA_PI = 3.14;
        final double LUEGO_INICIALIZO;
        
        //Tipos de literales 
            //Numeros enteros
            int num = 25; //el 25 se pierde 
            num = 514;
            //Caracteres 
            char letra;
            letra = 'a';
            char otraletra = 'b'; // Solo puedo poner una letra
             //otraLetra = 'ch'; (ERROR)
             //Tipo char guarda en relidad un entero
        
             //Cadenas de caracteres --> String
             String nombreAlumno = "Pepe";
             
             //de la clase String puedo declarar un nulo
             String telefono = null; 
             
             
        //Como concatenamos cadenas
        String resultado = "Tengo " + 12 + " años ";
        String numerito = num + "";
        System.out.println("num vale: " + num);
        System.out.println("la letra es : " + letra);
        System.out.println("Esto es 'literal' ¿vale?");
        System.out.println("Esto es: " + (char)95);
        
        //Tipos de datos blooleanos --> true o false 
        boolean terminamos; 
        terminamos = true;
        terminamos = false; 
    }
    
    
}
