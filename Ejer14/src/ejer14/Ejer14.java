/*
 EJEMPLO SWITCH
MOSTRA EL DIA DE LA SEMANA 
 */
package ejer14;


public class Ejer14 {

    
    public static void main(String[] args) {
        // Declaramos el dia de la semana
        int dia = '1';
        String resultado;
        switch (dia) {
            case '*':
            case '1':
            case 1:
                resultado = "lunes";
                break;
            case 2:
                resultado = " martes ";
                break;
            case 3:
                resultado = " miercoles ";
                break;
            case 4:
                resultado = " jueves ";
                break;
            case 5:
                resultado = " viernes ";
                break;
            case 6:
                resultado = " sabado ";
                break;
            case 7:
                resultado = " domingo ";
                break;
            default: 
                resultado = "inadecuado ";
                
        } // fin  del switch
        System.out.println(resultado);
    }
    
}
