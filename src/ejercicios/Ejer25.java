package ejercicios;

import java.util.Scanner;

public class Ejer25 {
    
    String frase;
    int cantidadPalabras;
    String[] palabras;
    
    public void pedirFrase(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese una frase");

        frase = entrada.nextLine();
        palabras = frase.split(" ");
        cantidadPalabras = palabras.length;

        System.out.println("Las palabras en la frase son:");

        for(int i=0; i<cantidadPalabras; i++){
            System.out.println(palabras[i]);
        }

    }


}
