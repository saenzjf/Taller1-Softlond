package ejercicios;

import java.util.Scanner;

public class Ejer24 {
    
    public void pedirDatos(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese la cadena");
        String oracion = entrada.nextLine();

        System.out.println("Ingrese la letra que desea reemplazar");
        char letraOriginal = entrada.next().charAt(0);
        System.out.println("Ingrese la letra con la que desea reemplazar");
        char letraReemplazada = entrada.next().charAt(0);

        String cadenaFinal = reemplazarLetra(oracion, letraOriginal, letraReemplazada);

        System.out.println("La cadena final es: "+cadenaFinal);

    }

    public String reemplazarLetra(String oracion, char letraOriginal, char letraReemplazada){
        return oracion.replace(letraOriginal, letraReemplazada);
    }
}
