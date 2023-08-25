package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer27 {
    
    public void pedirCadena(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese una cadena");
        String cadena = entrada.nextLine();

        ordenarAfabeticamente(cadena);

    }

    public void ordenarAfabeticamente(String cadena){

        String[] palabras = cadena.split(" ");
        Arrays.sort(palabras);

        System.out.println("Las palabras prdenadas son:");
        for(int i=0; i<palabras.length; i++){
            System.out.println(palabras[i]);
        }
    }
}
