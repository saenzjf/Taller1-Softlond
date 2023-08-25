package ejercicios;

import java.util.Arrays;

public class Ejer34 {
    
    public void iniciar() {
        
        int[] arreglo = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int posiciones = 3;  // Cambia esta cantidad de posiciones

        int[] arregloRotadoIzquierda = rotarIzquierda(arreglo, posiciones);
        int[] arregloRotadoDerecha = rotarDerecha(arreglo, posiciones);

        System.out.println("Arreglo original: " + Arrays.toString(arreglo));
        System.out.println("Arreglo rotado hacia la izquierda: " + Arrays.toString(arregloRotadoIzquierda));
        System.out.println("Arreglo rotado hacia la derecha: " + Arrays.toString(arregloRotadoDerecha));
    }

    public int[] rotarIzquierda(int[] arreglo, int posiciones){

        int n = arreglo.length;
        int[] resultado = new int[n];

        for (int i = 0; i < n; i++) {
            int nuevaPosicion = (i + n - posiciones) % n;
            resultado[nuevaPosicion] = arreglo[i];
        }

        return resultado;
    }

    public int[] rotarDerecha(int[] arreglo, int posiciones){
        int n = arreglo.length;
        int[] resultado = new int[n];

        for (int i = 0; i < n; i++) {
            int nuevaPosicion = (i + posiciones) % n;
            resultado[nuevaPosicion] = arreglo[i];
        }

        return resultado;
    }
}
