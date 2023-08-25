package ejercicios;

import java.util.Scanner;

public class Ejer32 {
    
    public void iniciar(){

        int[] arreglo = {15, 8, 42, 10, 27, 6, 50, 35};
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número a buscar: ");
        int numeroBuscado = scanner.nextInt();

        int indiceEncontrado = buscarNumero(arreglo, numeroBuscado);

        if (indiceEncontrado != -1) {
            System.out.println("El número se encuentra en el índice " + indiceEncontrado);
        } else {
            System.out.println("El número no se encuentra en el arreglo.");
        }
    }

    public int buscarNumero(int[] arreglo, int numero){

        for(int i=0; i<arreglo.length; i++){
            if(arreglo[i] == numero){
                return i;
            }
        }
        return -1;
    }
}
  