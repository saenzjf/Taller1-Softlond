package ejercicios;

import java.util.Scanner;

public class Ejer21 {
    
    String cadena;
    char letra;
    int cantidad;

    public void pedirDatos(){

        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese una cadena de texto");
        cadena = entrada.nextLine();

        System.out.println("Ingrese la letra a contar");
        letra = entrada.next().charAt(0);

        cantidad = contarLetra(cadena, letra);

        System.out.println("La letra ("+letra+") aparece "+cantidad+ " veces.");

    }

    public int contarLetra(String cadena, char letra){

        int contador = 0;

        for(int i = 0; i < cadena.length(); i++){
            if (cadena.charAt(i) == letra){
                contador = contador + 1;
            }
        }
        return contador;
    }
}
