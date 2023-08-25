package ejercicios;

import java.util.Scanner;

public class Ejer26 {
    
    public void pedirCadena(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese una cadena");
        String cadena = entrada.nextLine();

        int cantidad = cuantosCaracteres(cadena);
        System.out.println("Tiene: "+cantidad+" caracteres");
    }

    public int cuantosCaracteres(String cadena){
        
        int contador = 0;
        
        for(int i=0; i<cadena.length(); i++){
            if(cadena.charAt(i) != ' '){
                contador++;
            }
        }
        return contador;
    }
}
