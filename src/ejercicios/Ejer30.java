package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer30 {
        
    
    public void pedirArreglo(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño del arreglo");
        int tamaño = entrada.nextInt();
        System.out.println("Ingrese los numeros de arreglo");
        int[] arreglo = new int[tamaño];

        for(int i=0; i< tamaño; i++){
            arreglo[i] = entrada.nextInt();;
        }

        System.out.println("El array sin duplicados es: ");
        int[] arregloFinal = borrarDuplicados(arreglo);
        for(int i=0; i<arregloFinal.length; i++){
            System.out.println(arregloFinal[i]+" ");
        }

    }  

    public int[] borrarDuplicados(int[] arreglo){
        
        int n = arreglo.length;
        int[] arregloSinDuplicados = new int[n];

        int nuevoTamaño = 0;

        for(int i=0; i< n; i++){
            boolean duplicado = false;

            for(int j=0; j< nuevoTamaño; j++){
                if(arreglo[i] == arregloSinDuplicados[j]){
                    duplicado = true;
                    break;
                }
            }

            if(!duplicado){
                arregloSinDuplicados[nuevoTamaño] = arreglo[i];
                nuevoTamaño++;
            }
        }

        return Arrays.copyOf(arregloSinDuplicados, nuevoTamaño);
    }
}
