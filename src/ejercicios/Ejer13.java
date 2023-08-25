package ejercicios;

import java.util.Scanner;

public class Ejer13 {
    double numeroD;
    int decimales = 2;
    double numeroRedondeado;
    
    public double pedirNumeroDecimal(){
        System.out.println("Ingrese un numero decimal");
        Scanner entrada = new Scanner(System.in);
        numeroD = entrada.nextDouble();
        
        return numeroD;
    }

    public void mostrar(){
        numeroRedondeado = Math.round(numeroD * Math.pow(10, decimales)) / Math.pow(10, decimales);
        System.out.println("El numero redondeado es: " + numeroRedondeado);
    }
}
