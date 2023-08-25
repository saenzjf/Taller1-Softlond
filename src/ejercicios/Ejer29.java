package ejercicios;

import java.util.Scanner;

public class Ejer29 {

    public void pedirArreglo(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño del arreglo");
        int tamaño = entrada.nextInt();

        System.out.println("Ingrese los numeros de arreglo");
        int[] arreglo = new int[tamaño];

        for(int i=0; i< tamaño; i++){
            arreglo[i] = entrada.nextInt();;
        }

        numeroMasGrande(arreglo);
    }  

    public void numeroMasGrande(int[] arreglo){
        
        int maximo = arreglo[0];
        for(int i=1; i<arreglo.length; i++){
            if(maximo < arreglo[i]){
                maximo = arreglo[i];
            }
        }
        System.out.println("El numero mayor es: " + maximo);
    }
}
