package ejercicios;

import java.util.Scanner;

public class Ejer20 {
    
    String cadena, cadenaInvertida;
    
    public void invertirCadena(){
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese una cadena");
        cadena = entrada.nextLine();

        StringBuilder sb = new StringBuilder(cadena);
        cadenaInvertida = sb.reverse().toString();

        System.out.println(cadenaInvertida);
    }
}
