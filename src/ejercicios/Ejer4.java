package ejercicios;

import java.util.Scanner;

public class Ejer4 {
    int edad;

    public void pedirEdad(){
        Scanner entrada = new Scanner(System.in);   
        System.out.println("Ingrese su edad");
        edad = entrada.nextInt();
        //entrada.close();
    }

    public void mostrarEdad(){
        if(edad>=18){
            System.out.println("Es mayor de edad");
        }else{
            System.out.println("Es menor de edad");
        }
    }
}
