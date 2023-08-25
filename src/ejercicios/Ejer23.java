package ejercicios;

import java.util.Scanner;

public class Ejer23 {
    
    public void pedirOracion(){

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese una oracion");
        String oracion = entrada.nextLine();

        int cantidad = cuantasPalabras(oracion);
        System.out.println("La oracion tiene "+cantidad+" palabras");

        
    }

    public int cuantasPalabras(String oracion){

        String[] palabras = oracion.split("\\s+");
        return palabras.length;
    }
}
