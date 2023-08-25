package ejercicios;

import java.util.HashMap;
import java.util.Map;


public class Ejer33 {
    
    public void iniciar(){

        int[] arreglo = {4, 2, 8, 3, 4, 2, 8, 4, 5, 6, 8};

        Map<Integer, Integer> frecuencia = contarFrecuencia(arreglo);

        for (Map.Entry<Integer, Integer> entry : frecuencia.entrySet()) {
            int elemento = entry.getKey();
            int cantidad = entry.getValue();
            System.out.println("El elemento " + elemento + " aparece " + cantidad + " veces.");
        }
        

    }

    public Map<Integer, Integer> contarFrecuencia(int[] arreglo){

        Map<Integer, Integer> frecuencia = new HashMap<>();

        for (int elemento : arreglo) {
            frecuencia.put(elemento, frecuencia.getOrDefault(elemento, 0) + 1);
        }

        return frecuencia;
    }
}
