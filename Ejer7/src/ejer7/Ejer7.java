/*
Ejer7.-  Dado el radio, hacer un programa en 
Java que calcule el área y el volumen de una esfera: 
a=4*PI*r*r;  v=(4/3)*PI*r*r*r;
 */
package ejer7;


public class Ejer7 {

   
    public static void main(String[] args) {
        double ra = 10;
        final double PI = Math.PI;
        double a;
        double v;
        
        a = 4*PI*ra*ra;
        System.out.println("El area es " + a);
        
        v = (4/3)*PI*ra*ra*ra;
        System.out.println("El volumen es " + v);
    }
    
}
