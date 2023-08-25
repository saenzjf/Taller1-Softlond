package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer22 {
    
    String oracion;
    
    public void pedirOracion(){

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese una oracion");
        
        oracion = entrada.nextLine();

        if (esPalindromo(oracion)){
            System.out.println("Es palindromo");
        }else{
            System.out.println("No es palindromo");
        }
        
    }

    public boolean esPalindromo(String oracion){

        char[] caracteres = oracion.toCharArray();
        int longitud = caracteres.length;

        for(int i=0; i< longitud; i++){
            if (caracteres[i] != caracteres[longitud - i - 1]){
                return false;
            }
        }
        return true;
    }
}
