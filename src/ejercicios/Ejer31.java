package ejercicios;

import java.util.Scanner;

public class Ejer31 {
    

    public void pedirArreglo(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño del arreglo");
        int tamaño = entrada.nextInt();
        System.out.println("Ingrese los numeros de arreglo");
        int[] arreglo = new int[tamaño];

        for(int i=0; i< tamaño; i++){
            arreglo[i] = entrada.nextInt();;
        }

        ordenarBurbuja(arreglo);
        
    } 

    public void ordenarBurbuja(int[] arreglo){
        
        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    // Intercambia los elementos si están en el orden incorrecto
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
    }
}
