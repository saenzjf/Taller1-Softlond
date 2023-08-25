package ejercicios;

import java.util.Scanner;

public class Ejer19 {
    
    String nombre, nombreMayuscula, nombreMinuscula;

    public void pedirNombre(){
        System.out.println("Ingrese su nombre");
        Scanner scanner = new Scanner(System.in);
        nombre = scanner.nextLine();
        
        nombreMayuscula = nombre.toUpperCase();
        nombreMinuscula = nombre.toLowerCase();

        System.out.println("Nombre en mayuscula: "+ nombreMayuscula);
        System.out.println("Nombre en minuscula: "+ nombreMinuscula);

    }


}
